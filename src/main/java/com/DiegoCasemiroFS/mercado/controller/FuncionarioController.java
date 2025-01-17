package com.DiegoCasemiroFS.mercado.controller;

import com.DiegoCasemiroFS.mercado.entity.Funcionario;
import com.DiegoCasemiroFS.mercado.entity.dtos.FuncionarioRequestDto;
import com.DiegoCasemiroFS.mercado.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    @GetMapping("/pesquisa/{id}")
    public Funcionario pesquisaFuncionario(@RequestBody Long id) {
        return funcionarioService.pesquisaFuncionario(id);
    }

    @GetMapping("/listaTodos")
    public List<Funcionario> listaFuncionarios() {
        return funcionarioService.listaFuncionarios();
    }
    @PostMapping("/cadastro")
    public Funcionario cadastro(@RequestBody Funcionario funcionario) {
        return funcionarioService.cadastro(funcionario);
    }

    @PutMapping("/atualiza/{id}")
    public Funcionario autualizaCadastro(@RequestBody Long id, @RequestBody FuncionarioRequestDto funcionarioRequestDto){
        return funcionarioService.autualizaCadastro(id, funcionarioRequestDto);
    }

    public void deletaFuncionario(@RequestBody Long id) {
        funcionarioService.deletaFuncionario(id);
    }
}
