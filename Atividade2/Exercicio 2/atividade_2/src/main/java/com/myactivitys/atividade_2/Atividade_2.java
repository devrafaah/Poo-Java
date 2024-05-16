/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.myactivitys.atividade_2;

import javax.swing.JOptionPane;

/**
 *
 * @author MobDi
 */
public class Atividade_2 {

    public static void main(String[] args) {
        String name, marca, fabricante, cod_barras;
        float preco;
        
        // passando valores para o construtor 1 depois que usuario preencheu os dados.
        // atraves de um JOptionPane.
        Produto p1 = new Produto();
        
        name = JOptionPane.showInputDialog(null,"Digite o nome do Produto","PRODUTO 1", JOptionPane.INFORMATION_MESSAGE);
        marca = JOptionPane.showInputDialog(null,"Digite a marca do Produto","PRODUTO 1", JOptionPane.INFORMATION_MESSAGE);
        fabricante = JOptionPane.showInputDialog(null,"Digite o fabricante do Produto","PRODUTO 1", JOptionPane.INFORMATION_MESSAGE);
        cod_barras = JOptionPane.showInputDialog(null,"Digite os 3 primeiros e os 3 ultimos digitos Codigo de barras desse produto","PRODUTO 1", JOptionPane.INFORMATION_MESSAGE);
        preco = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o preco do produto","PRODUTO 1", JOptionPane.INFORMATION_MESSAGE));
        
        p1.nome = name;
        p1.marca = marca;
        p1.fabricante = fabricante;
        p1.cod_barras = cod_barras;
        p1.preco = preco;
        
        
        System.out.println("|--------- Produto 1 ----------");
        System.out.println("| nome: "+p1.nome);
        System.out.println("| marca: "+p1.marca);
        System.out.println("| fabricante: "+p1.fabricante);
        System.out.println("| cod_barras: "+p1.cod_barras);
        System.out.println("| preco: "+p1.preco);
        System.out.println("|-------------------------------");
        
        JOptionPane.showMessageDialog(null,"Registrando o próximo produto","INFORMAÇÃO",JOptionPane.INFORMATION_MESSAGE);
        
        
        name = JOptionPane.showInputDialog(null,"Digite o nome do Produto","PRODUTO 2", JOptionPane.INFORMATION_MESSAGE);
        marca = JOptionPane.showInputDialog(null,"Digite a marca do Produto","PRODUTO 2", JOptionPane.INFORMATION_MESSAGE);
        fabricante = JOptionPane.showInputDialog(null,"Digite o fabricante do Produto","PRODUTO 2", JOptionPane.INFORMATION_MESSAGE);
        cod_barras = JOptionPane.showInputDialog(null,"Digite os 3 primeiros e os 3 ultimos digitos Codigo de barras desse produto","PRODUTO 2", JOptionPane.INFORMATION_MESSAGE);
        preco = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o preco do produto","PRODUTO 2", JOptionPane.INFORMATION_MESSAGE));
        
        // utilizando o segundo construtor
        Produto p2 = new Produto(name,marca,fabricante,cod_barras,preco);
        
        System.out.println("|--------- Produto 2 ----------");
        System.out.println("| nome: "+p2.nome);
        System.out.println("| marca: "+p2.marca);
        System.out.println("| fabricante: "+p2.fabricante);
        System.out.println("| cod_barras: "+p2.cod_barras);
        System.out.println("| preco: "+p2.preco);
        System.out.println("|-------------------------------");
    }
    
}
