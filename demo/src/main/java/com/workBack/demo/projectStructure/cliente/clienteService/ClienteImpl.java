package com.workBack.demo.projectStructure.cliente.clienteService;

import com.workBack.demo.Utils.Info;
import com.workBack.demo.Utils.mappers.ClienteMapper;
import com.workBack.demo.projectStructure.cliente.ClienteDto;
import com.workBack.demo.projectStructure.cliente.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente saveClient(Cliente client) {
        return clienteRepository.save(client);
    }

    @Override
    public List<Cliente> getAllClients() {
        return clienteRepository.findAll();
    }

    @Override
    public Optional<Cliente> getClientById(Long id) {
        return clienteRepository.findById(id);
    }

    @Override
    public Cliente updateClient(Long id, Cliente client) {
        Optional<Cliente> existingClient = clienteRepository.findById(id);

        if (existingClient.isPresent()){
            Cliente updateClient = existingClient.get();
            updateClient.setNome(client.getNome());
            updateClient.setEmail(client.getEmail());
            return clienteRepository.save(updateClient);
        }
        return null;
    }

    @Override
    public void deleteClient(Long id) {
        clienteRepository.deleteById(id);
    }

    @Override
    public Info searchClientByEmail(String email) {
        Info info = new Info<>();
        try {
            Optional<Cliente> cliente = clienteRepository.findByEmail(email);

            ClienteDto clienteDto = cliente.isPresent() ? ClienteMapper.convertClientToClientDto(cliente.get()) : null;

            info.setData(clienteDto);
            info.setSuccess(cliente.isPresent());
            info.setMessage(cliente.isPresent() ? "Email encontrado" : "Email não encontrado" );
        } catch (Exception e) {
            info.setErrorMessage("Ocorreu um Erro tentando buscar o Email");
            return info;
        }
        return info;
    }
}
