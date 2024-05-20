/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myactivitys.atividade6_2;

/**
 *
 * @author MobDi
 */
public class Programador extends Empregado {
    private float qtdeHoras;

    public float getQtdeHoras() {
        return qtdeHoras;
    }

    public void setQtdeHoras(float qtdeHoras) {
        this.qtdeHoras = qtdeHoras;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

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
    private float valorHora;
    
    public Programador(){
        
    }
    public Programador(String n, String m, float qh, float vh){
        this.nome = n;
        this.matricula = m;
        this.qtdeHoras = qh;
        this.valorHora = vh;
    }
    
    @Override
    public float calculaSalario() {
        return valorHora * qtdeHoras; 
    }
    
    
}
