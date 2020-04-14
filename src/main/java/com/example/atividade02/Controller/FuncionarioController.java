package com.example.atividade02.Controller;


import com.example.atividade02.Entidade.Funcionario;
import com.example.atividade02.Service.FuncionarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * FuncionarioController
 */
@Controller
public class FuncionarioController {

    @Autowired
    private FuncionarioService fs;

    @GetMapping ("/funcionarios")
    public ModelAndView getFuncionarios() 
    {
        ModelAndView mv = new ModelAndView ("funcionarios");
        
        mv.addObject("funcionarios", fs.getFuncionarios());

        return mv;
    }

    @PostMapping ("/salvar")
    public String salvar(@ModelAttribute Funcionario funcionario){
        fs.salvar(funcionario);
        return "redirect:/funcionarios";
    } 
    

}