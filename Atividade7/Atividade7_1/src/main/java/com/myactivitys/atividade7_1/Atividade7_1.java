/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.myactivitys.atividade7_1;

import javax.swing.JOptionPane;

/**
 *
 * @author MobDi
 */
public class Atividade7_1 {

    public static void main(String[] args) {
        Pessoa p = null;
        
        while (true) {
            int tipo = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite uma opção:" +
                    "\n1 - Aluno" +
                    "\n2 - Professor" +
                    "\n3 - Funcionario" +
                    "\n4 - Sair"));
            
            switch(tipo) {
                case 1:
                    p = new Aluno();
                    break;
                case 2:
                    p = new Professor();
                    break;
                case 3:
                    p = new Funcionario();
                    break;
                case 4:
                    System.out.println("Bye...Bye...");
                    System.exit(0);
                    break;
                default: {
                    System.out.println("Opção invalida");
                    System.exit(0);
                }
            }
            // nao tera null pointer por que caso inserir opção invalida vai sair do programa.
            System.out.println(p.mostraClasse());
        }
    }
}
