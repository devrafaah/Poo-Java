/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.myactivitys.atividade8_1;

import javax.swing.JOptionPane;

/**
 *
 * @author MobDi
 */
public class Atividade8_1 {

    public static void main(String[] args) {

        Agenda agenda = new Agenda();
        
        agenda.entDados();
        agenda.entDados();
        
        agenda.imprimir();
        
        String searching = "Rafael";
        System.out.println("buscando: "+searching);
        System.out.println(agenda.buscar(searching));
        String searchingError = "Fulano";
        System.out.println("buscando: "+searchingError);
        System.out.println(agenda.buscar(searchingError));
    }
}
