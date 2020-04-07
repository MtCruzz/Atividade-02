package com.example.atividade02.Service;

import java.util.List;

import com.example.atividade02.Entidade.Funcionario;
import com.example.atividade02.Repository.FuncionarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * FuncionarioService
 */
@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository fr; 

    public List<Funcionario> getFuncionarios ()
    {
        return fr.findAll();
    }
}