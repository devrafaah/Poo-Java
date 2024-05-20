/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myactivitys.atividade7_1;

/**
 *
 * @author MobDi
 */
public class Professor extends Pessoa {
    private int matricula;
    private String campus;
    
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }
    
    
    public Professor(){
        
    }
    
    @Override
    public String mostraClasse(){
        return "Classe Professor";
    }
}
