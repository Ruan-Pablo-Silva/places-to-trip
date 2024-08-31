package com.workBack.demo.projectStructure.cliente.clienteService;

import com.workBack.demo.constants.Constants;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Cliente {

    //generated value diz que será um valor gerenciado e strategy qual a estrategia de geração
    // GenerationType do tipo IDENTITY indica que o banco que cuidará do incremento
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = Constants.FIELD_CANT_BE_NULL)
    @Size(min = 3, max = 50, message = Constants.FIELD_IS_PASSING_LIMIT_CHARACTERS)
    @Column(name = "NOME", nullable = false, length = 100)
    private String nome;

    @NotNull
    @Column(name = "EMAIL", unique = true)
    @Size(max = 50, message = Constants.FIELD_IS_PASSING_LIMIT_CHARACTERS)
    @Email(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}", message = Constants.INVALID_EMAIL)
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
