package com.example.atividade02.Repository;

import com.example.atividade02.Entidade.Funcionario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * FuncionarioRepository
 */
@Repository
public interface FuncionarioRepository extends JpaRepository <Funcionario, Integer>  {}