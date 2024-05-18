/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.myactivitys.atividade5_2;

import javax.swing.JOptionPane;

/**
 *
 * @author MobDi
 */
public class Atividade5_2 {

    public static void main(String[] args) {
        double base, altura;
        
        
        
        base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do triângulo"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do triângulo"));
        // Objeto criado
        Triangulo t1 = new Triangulo();
        
        // passando os valores que o usuario digitou que são base e altura.
        t1.setBase(base);
        t1.setAltura(altura);
        
        // criando o Objeto e definindo valores automatico
        Triangulo t2 = new Triangulo(10,10);
        
        // acessando os valores direto do objeto e passando.
        t2.setBase(t2.getBase());
        t2.setAltura(t2.getBase());
        
        // imprimindo o triangulo 1.
        System.out.println("TRIANGULO 1");
        t1.imprimeDados();
        // barra para melhor visualização no console
        System.out.println("---------------------------");
        // imprimindo o triangulo 2 ( com valores automaticos )
        System.out.println("TRIANGULO 2");
        t2.imprimeDados();
    }
}
