package com.example.atividade02.Entidade;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Funcionario
 */
@Entity
public class Funcionario {

    @Id
    private int id;
    private String nome;
    private String rg;
    private int salario;
    private String datanasc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(String datanasc) {
        this.datanasc = datanasc;
    }

    @Override
    public String toString() {
        return "Funcionario [datanasc=" + datanasc + ", id=" + id + ", nome=" + nome + ", rg=" + rg + ", salario="
                + salario + "]";
    }

    
}