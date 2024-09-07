package com.workBack.demo.projectStructure.cliente;

import com.workBack.demo.Utils.Info;
import com.workBack.demo.projectStructure.cliente.clienteService.Cliente;
import com.workBack.demo.projectStructure.cliente.clienteService.ClienteImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "http://localhost:4200")
@Controller
@RestController
@RequestMapping("/clientRegister")
public class ClienteController {

    @Autowired
    private ClienteImpl clientImpl;

    @PostMapping //what is ResponseEntity, @RequestBody
    public ResponseEntity<String> createPlace(@RequestBody Cliente client){

        try{
            clientImpl.saveClient(client);
            return ResponseEntity.ok("Salvo seu Nombre");
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Voce cagou tudo " + e.getMessage());
        }

    }

    @GetMapping("/search-client")
    public ResponseEntity<Info<?>> searchEmail(@RequestParam String email){
        Info<?> info = new Info<>();
        try {
             info = clientImpl.searchClientByEmail(email);
        }catch (Exception e){
            info.setErrorMessage("Erro ao buscar email do cliente");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(info);
        }
        return ResponseEntity.status(info.isSuccess() ? HttpStatus.OK : HttpStatus.NOT_FOUND).body(info);
    }


}
