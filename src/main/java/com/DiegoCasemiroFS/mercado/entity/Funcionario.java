package com.DiegoCasemiroFS.mercado.entity;

import com.DiegoCasemiroFS.mercado.entity.enums.Funcao;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
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

    private Endereco endereco;

    private Funcao funcao;
}

