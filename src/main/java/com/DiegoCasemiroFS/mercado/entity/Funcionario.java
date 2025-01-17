package com.DiegoCasemiroFS.mercado.entity;

import com.DiegoCasemiroFS.mercado.entity.enums.Funcao;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Table(name="funcionario")
@AllArgsConstructor
@NoArgsConstructor
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String cpf;

    private String telefone;

    @Embedded
    private Endereco endereco;

    @Enumerated(EnumType.STRING)
    private Funcao funcao;
}

