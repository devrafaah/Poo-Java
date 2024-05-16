/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.myactivitys.atividade3;


import javax.swing.JOptionPane;

/**
 *
 * @author MobDi
 */
public class Atividade3 {

    public static void main(String[] args) {
        String nome;
        float saldo, limite;
        String getTipo;
        char tipo;
        
        nome = JOptionPane.showInputDialog("Digite seu nome, Por favor!!");        
        saldo = Float.parseFloat(JOptionPane.showInputDialog("Qual o seu saldo Atual: " + nome));
        JOptionPane.showMessageDialog(null, "Bom dia " +nome +" voce possui limite de R$" +saldo + "reais", "INFORMAÇÃO", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Digite abaixo o seu tipo de conta 'S' para SIMPLES ou 'C' para COMPOSTA na proxima instrução", "INFORMAÇÃO", JOptionPane.INFORMATION_MESSAGE);
        getTipo = JOptionPane.showInputDialog("Digite o tipo da sua conta, Por favor 'c' para corrente ou 'p' para poupança");
        tipo = getTipo.charAt(0);
        
        while(tipo != 'c' && tipo != 'p'){
            getTipo = JOptionPane.showInputDialog("Digite um tipo Valido!! 'c' para corrente ou 'p' para poupança");
            tipo = getTipo.charAt(0);
        }
        limite = saldo;
        ContaCorrente c1 = new ContaCorrente();
        c1.CadastraDados(nome, saldo, limite, tipo);
        System.out.println(c1.ImprimeDados());
        
        
        JOptionPane.showMessageDialog(null, "Cliente "+nome+" adicionado com sucesso....", "INFORMAÇÃO", JOptionPane.INFORMATION_MESSAGE);
        // uma melhor visualização no console.
        System.out.println("---------------- ---------------- ------------ ------------");
        JOptionPane.showMessageDialog(null, "Adicionando o segundo cliente no nosso sistema", "INFORMAÇÃO", JOptionPane.INFORMATION_MESSAGE);
        
        
        nome = JOptionPane.showInputDialog("Digite seu nome, Por favor!!");        
        saldo = Float.parseFloat(JOptionPane.showInputDialog("Qual o seu saldo Atual: " + nome));
        JOptionPane.showMessageDialog(null, "Bom dia " +nome +" voce possui limite de R$" +saldo + "reais", "INFORMAÇÃO", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Digite abaixo o seu tipo de conta 'S' para SIMPLES ou 'C' para COMPOSTA na proxima instrução", "INFORMAÇÃO", JOptionPane.INFORMATION_MESSAGE);
        getTipo = JOptionPane.showInputDialog("Digite o tipo da sua conta, Por favor 'c' para corrente ou 'p' para poupança");
        tipo = getTipo.charAt(0);
        while(tipo != 'c' && tipo != 'p'){
            getTipo = JOptionPane.showInputDialog("Digite um tipo Valido!! 'c' para corrente ou 'p' para poupança");
            tipo = getTipo.charAt(0);
        }
        ContaCorrente c2 = new ContaCorrente(nome,saldo,tipo);
        c2.CadastraDados(nome, saldo, saldo, tipo);
        System.out.println(c2.ImprimeDados());
        
        
        
        
        JOptionPane.showMessageDialog(null, "Cliente "+nome+" adicionado com sucesso....", "INFORMAÇÃO", JOptionPane.INFORMATION_MESSAGE);
        // uma melhor visualização no console.
        System.out.println("---------------- ---------------- ------------ ------------");
        JOptionPane.showMessageDialog(null, "Adicionando o terceiro cliente no nosso sistema", "INFORMAÇÃO", JOptionPane.INFORMATION_MESSAGE);
        
        
        
        
        
        nome = JOptionPane.showInputDialog("Digite seu nome, Por favor!!");        
        saldo = Float.parseFloat(JOptionPane.showInputDialog("Qual o seu saldo Atual: " + nome));
        JOptionPane.showMessageDialog(null, "Bom dia " +nome +" voce possui limite de R$" +saldo + "reais", "INFORMAÇÃO", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Digite abaixo o seu tipo de conta 'S' para SIMPLES ou 'C' para COMPOSTA na proxima instrução", "INFORMAÇÃO", JOptionPane.INFORMATION_MESSAGE);
        getTipo = JOptionPane.showInputDialog("Digite o tipo da sua conta, Por favor 'c' para corrente ou 'p' para poupança");
        tipo = getTipo.charAt(0);
        limite = saldo;
        while(tipo != 'c' && tipo != 'p'){
            getTipo = JOptionPane.showInputDialog("Digite um tipo Valido!! 'c' para corrente ou 'p' para poupança");
            tipo = getTipo.charAt(0);
        }
        ContaCorrente c3 = new ContaCorrente(nome,saldo,limite,tipo);
        c3.CadastraDados(nome, saldo, saldo, tipo);
        //exemplos de deposito, saque, e impressão dos dados.
        c3.Depositar(1000);
        c3.Sacar(2000);
        System.out.println(c3.ImprimeDados());
        
    }
}
