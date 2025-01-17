package com.DiegoCasemiroFS.mercado.service;

import com.DiegoCasemiroFS.mercado.entity.Funcionario;
import com.DiegoCasemiroFS.mercado.entity.dtos.FuncionarioRequestDto;
import com.DiegoCasemiroFS.mercado.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public Funcionario pesquisaFuncionario(Long id) {
        return funcionarioRepository.findById(id).orElseThrow(() -> new RuntimeException("Funcionário não encontrado"));
    }

    public List<Funcionario> listaFuncionarios() {
        return funcionarioRepository.findAll();
    }

    public Funcionario cadastro(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    public Funcionario autualizaCadastro(Long id, FuncionarioRequestDto funcionarioRequestDto){
        return funcionarioRepository.findById(id)
                .map(f -> {
                    f.setTelefone(funcionarioRequestDto.getTelefone());
                    f.setEndereco(funcionarioRequestDto.getEndereco());
                    f.setFuncao(funcionarioRequestDto.getFuncao());
                    return funcionarioRepository.save(f);
                }).orElseThrow(() -> new RuntimeException("Funcionário não encontrado"));
    }

    public void deletaFuncionario(Long id) {
        funcionarioRepository.deleteById(id);
    }
}
