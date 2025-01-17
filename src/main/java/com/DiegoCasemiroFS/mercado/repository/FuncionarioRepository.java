package com.DiegoCasemiroFS.mercado.repository;

import com.DiegoCasemiroFS.mercado.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}
