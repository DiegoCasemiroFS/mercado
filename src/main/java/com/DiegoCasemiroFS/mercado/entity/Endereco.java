package com.DiegoCasemiroFS.mercado.entity;

public record Endereco(String rua, String numero, String bairro, String cidade, String estado, String cep) {

    /*public Endereco {
        if (rua.isBlank()) {
            throw new IllegalArgumentException("Rua não pode ser vazia");
        }
        if (numero.isBlank()) {
            throw new IllegalArgumentException("Número não pode ser vazio");
        }
        if (bairro.isBlank()) {
            throw new IllegalArgumentException("Bairro não pode ser vazio");
        }
        if (cidade.isBlank()) {
            throw new IllegalArgumentException("Cidade não pode ser vazia");
        }
        if (estado.isBlank()) {
            throw new IllegalArgumentException("Estado não pode ser vazio");
        }
        if (cep.isBlank()) {
            throw new IllegalArgumentException("CEP não pode ser vazio");
        }
    }*/
}
