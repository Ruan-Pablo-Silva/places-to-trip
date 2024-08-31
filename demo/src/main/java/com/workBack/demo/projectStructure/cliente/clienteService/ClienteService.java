package com.workBack.demo.projectStructure.cliente.clienteService;

import com.workBack.demo.Utils.Info;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ClienteService {
    Cliente saveClient(Cliente client);

    List<Cliente> getAllClients();

    Optional<Cliente> getClientById(Long id);

    Cliente updateClient(Long id ,Cliente client);

    void deleteClient(Long id);

    Info searchClientByEmail(String email);

}
