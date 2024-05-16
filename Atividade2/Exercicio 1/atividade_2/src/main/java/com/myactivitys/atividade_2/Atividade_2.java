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
        String name, rg, endereco, telefone, dia,mes,ano, profissao, DataNascimento, DataNascimento2;
        int d,m,a;
        
        
        
        name = JOptionPane.showInputDialog(null,"Digite o seu primeiro nome","PACIENTE 1", JOptionPane.INFORMATION_MESSAGE);
        rg = JOptionPane.showInputDialog(null,name +" Digite o seu RG","PACIENTE 1", JOptionPane.INFORMATION_MESSAGE);
        endereco = JOptionPane.showInputDialog(null,name +" Digite o seu endereco","PACIENTE 1", JOptionPane.INFORMATION_MESSAGE);
        telefone = JOptionPane.showInputDialog(null,name +" Digite o seu telefone","PACIENTE 1", JOptionPane.INFORMATION_MESSAGE);
        profissao = JOptionPane.showInputDialog(null,name +" Digite a sua profissao","PACIENTE 1", JOptionPane.INFORMATION_MESSAGE);
        dia = JOptionPane.showInputDialog(null,name +" Digite o dia em que nasceu [NUMERO]","PACIENTE 1", JOptionPane.INFORMATION_MESSAGE);
        d = Integer.parseInt(dia);
        mes = JOptionPane.showInputDialog(name +" Agora digite o mês [NUMERO]");
        m = Integer.parseInt(mes);
        ano = JOptionPane.showInputDialog(name +" Por ultimo o ano que nasceu [NUMERO]");
        a = Integer.parseInt(ano);
        
        
        
        // foi criado uma classe DataFromart onde é formatado a data que o usuario vai inserir
        DataFormart newData1 = new DataFormart(d,m,a);
        // aqui é feito a chamada no método da dataFormart fazendo a formação da data que o usuario forneceu... 
        DataNascimento = newData1.DataFormatada(d, m, a);
        Paciente p1 = new Paciente();
        
        
        // Atribuição na classe Paciente 1 com todos os dados fornecidos pelo usuario
        p1.nome = name;
        p1.rg = rg;
        p1.endereco = endereco;
        p1.telefone = telefone;
        p1.dataNascimento = DataNascimento;
        p1.profissao = profissao;
        
        
        // mostrando na tela o resultado do paciente e seus dados...
        System.out.println("|------------- PACIENTE 1 -------------");
        System.out.println("| Nome: " + p1.nome);
        System.out.println("| Rg: " + p1.rg);
        System.out.println("| endereco: " + p1.endereco);
        System.out.println("| telefone: " + p1.telefone);
        System.out.println("| Data Nascimento: " + p1.dataNascimento);
        System.out.println("| Profissao: " + p1.profissao);
        System.out.println("|--------------------------------------|");
        
        
        // informação para adicionar o segundo paciente
        JOptionPane.showMessageDialog(null,"Agora vamos adicionar o segundo paciente no nosso sistema", "INFORMAÇÃO",JOptionPane.INFORMATION_MESSAGE);
        
        
        
        name = JOptionPane.showInputDialog(null,"Digite o seu primeiro nome","PACIENTE 2", JOptionPane.INFORMATION_MESSAGE);
        rg = JOptionPane.showInputDialog(null,name +" Digite o seu RG","PACIENTE 2", JOptionPane.INFORMATION_MESSAGE);
        endereco = JOptionPane.showInputDialog(null,name +" Digite o seu endereco","PACIENTE 2", JOptionPane.INFORMATION_MESSAGE);
        telefone = JOptionPane.showInputDialog(null,name +" Digite o seu telefone","PACIENTE 2", JOptionPane.INFORMATION_MESSAGE);
        profissao = JOptionPane.showInputDialog(null,name +" Digite a sua profissao","PACIENTE 2", JOptionPane.INFORMATION_MESSAGE);
        
        dia = JOptionPane.showInputDialog(null,name +" Digite o dia em que nasceu","PACIENTE 2", JOptionPane.INFORMATION_MESSAGE);
        d = Integer.parseInt(dia);
        mes = JOptionPane.showInputDialog(null,name +" Agora digite o mês (numero)","PACIENTE 2", JOptionPane.INFORMATION_MESSAGE);
        m = Integer.parseInt(mes);
        ano = JOptionPane.showInputDialog(null,name +" Por ultimo o ano que nasceu","PACIENTE 2", JOptionPane.INFORMATION_MESSAGE);
        a = Integer.parseInt(ano);
        
        
        // utilizando o segundo construtor da classe Paciente que recebe um nome !!
        Paciente p2 = new Paciente(name);
        DataFormart newData2 = new DataFormart(d,m,a);
        DataNascimento2 = newData2.DataFormatada(d, m, a);
        
        p2.rg = rg;
        p2.endereco = endereco;
        p2.telefone = telefone;
        p2.profissao = profissao;
        p2.dataNascimento = DataNascimento2;
        
        
        
        
        // mostrando na tela o resultado do paciente numero 2 e seus dados...
        System.out.println("|------------- PACIENTE 2 -------------");
        System.out.println("| Nome: " + p2.nome);
        System.out.println("| Rg: " + p2.rg);
        System.out.println("| endereco: " + p2.endereco);
        System.out.println("| telefone: " + p2.telefone);
        System.out.println("| Data Nascimento: " + p2.dataNascimento);
        System.out.println("| Profissao: " + p2.profissao);
        System.out.println("|--------------------------------------|");
        
        
        System.out.println("FIM");
    }
    
}
