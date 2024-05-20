/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myactivitys.atividade8_2;

/**
 *
 * @author MobDi
 */
public abstract class Empregado {

    protected String nome;
    protected String matricula;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Empregado() {

    }

    public Empregado(String n, String m) {
        this.nome = n;
        this.matricula = m;
    }

    // default return
    public float calculaSalario() {
        return 2.0f;
    }
}
