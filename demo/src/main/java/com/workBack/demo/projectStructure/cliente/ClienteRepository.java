package com.workBack.demo.projectStructure.cliente;

import com.workBack.demo.projectStructure.cliente.clienteService.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    Optional<Cliente> findByEmail(String emael);

}
