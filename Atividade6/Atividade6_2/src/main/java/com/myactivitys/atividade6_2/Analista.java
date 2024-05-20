/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myactivitys.atividade6_2;

/**
 *
 * @author MobDi
 */
public class Analista extends Empregado {
    private float valorPorProjeto[];

    public float[] getValorPorProjeto() {
        return valorPorProjeto;
    }

    public void setValorPorProjeto(float[] valorPorProjeto) {
        this.valorPorProjeto = valorPorProjeto;
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
    
    public Analista(){
        
    }
    public Analista(String n, String m, float vP[]){
        this.nome = n;
        this.matricula = m;
        this.valorPorProjeto = vP;
    }
    
    public float calculaSalario() {
        float salario = 0f;
        for(int i = 0; i < valorPorProjeto.length; i++){
            salario = salario + valorPorProjeto[i];
        }
        return salario;
    }
}
