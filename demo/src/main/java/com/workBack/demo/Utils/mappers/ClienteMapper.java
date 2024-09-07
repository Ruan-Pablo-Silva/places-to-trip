package com.workBack.demo.Utils.mappers;

import com.workBack.demo.projectStructure.cliente.ClienteDto;
import com.workBack.demo.projectStructure.cliente.clienteService.Cliente;

public class  ClienteMapper {
    public static ClienteDto convertClientToClientDto(Cliente cliente){

        try {
            ClienteDto clienteDto = new ClienteDto();

            clienteDto.setId(cliente.getId());
            clienteDto.setNome(cliente.getNome());
            clienteDto.setEmail(cliente.getEmail());

            return clienteDto;
        }catch (Exception  e){
            System.out.println(e.getLocalizedMessage());
            return null;
        }
    }

    public static Cliente convertClientDtoToClient(ClienteDto clienteDto){

        try {
            Cliente cliente = new Cliente();

            cliente.setId(cliente.getId());
            cliente.setNome(cliente.getNome());
            cliente.setEmail(cliente.getEmail());

            return cliente;
        }catch (Exception  e){
            System.out.println(e.getLocalizedMessage());
            return null;
        }
    }
}


