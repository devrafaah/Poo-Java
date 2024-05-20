/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myactivitys.atividade8_2;

/**
 *
 * @author MobDi
 */
public class Analista extends Empregado{
    private float valorPorProjeto[];

    public float[] getValorPorProjeto() {
        return valorPorProjeto;
    }

    public void setValorPorProjeto(float[] valorPorProjeto) {
        this.valorPorProjeto = valorPorProjeto;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getMatricula() {
        return matricula;
    }

    @Override
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    
    public Analista(){
        
    }
    
    public Analista(String n, String m, float vP[]) {
        this.nome = n;
        this.matricula = m;
        this.valorPorProjeto = vP;
    }
    
    @Override
    public float calculaSalario() {
        float value = 0;
        for(int i = 0; i < valorPorProjeto.length;i++){
            value = value + valorPorProjeto[i];
        }
        return value;
    }
}
