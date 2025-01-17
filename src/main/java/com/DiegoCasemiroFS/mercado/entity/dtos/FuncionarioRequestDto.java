package com.DiegoCasemiroFS.mercado.entity.dtos;

import com.DiegoCasemiroFS.mercado.entity.Endereco;
import com.DiegoCasemiroFS.mercado.entity.enums.Funcao;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class FuncionarioRequestDto {

    private String telefone;

    private Endereco endereco;

    private Funcao funcao;
}