/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.myactivitys.atividade5_3;

import javax.swing.JOptionPane;

/**
 *
 * @author MobDi
 */
public class Atividade5_3 {

    public static void main(String[] args) {
        Torneio p1 = new Torneio("Maria", 8);
        p1.imprimeDados();
        
        Torneio p2 = new Torneio("João", 25);
        p2.imprimeDados();
        
        // metodo para verificar a categoria de ambos atletas...
        JOptionPane.showMessageDialog(null, "Categoria da "+p1.getNome()+"\n\n"+p1.verificaCategoria());
        JOptionPane.showMessageDialog(null, "Categoria da "+p2.getNome()+"\n\n"+p2.verificaCategoria());
        
        
    }
}
