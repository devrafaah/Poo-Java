/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.myactivitys.atividade4_2;

import java.time.LocalDateTime;
import javax.swing.JOptionPane;

/**
 *
 * @author MobDi
 */
public class Atividade4_2 {

    public static void main(String[] args) {
        String nome,rg,endereco,profissao, telefone;
        int anoNascimento, idade;
        
        
        nome = JOptionPane.showInputDialog("Digite o nome do paciente");
        rg = JOptionPane.showInputDialog("Digite o rg completo do paciente "+nome);
        endereco = JOptionPane.showInputDialog("Digite o endereco do "+nome);
        telefone = JOptionPane.showInputDialog("Digite o telefone do usuario "+nome);
        profissao = JOptionPane.showInputDialog("Digite a profissao de "+nome);
        anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Por fim o ano de nascimento"));
        
        Paciente p1 = new Paciente();
        p1.cadastraDados(nome, rg, endereco, telefone, anoNascimento, rg);
        p1.nome = nome;
        p1.rg = rg;
        p1.endereco = endereco;
        p1.telefone = telefone;
        p1.profissao = profissao;
        p1.anoNascimento = anoNascimento;
        
        LocalDateTime year = LocalDateTime.now();
        idade = p1.calculaIdade(year.getYear());
        p1.imprimeDados(idade);
        
        
        JOptionPane.showMessageDialog(null, "registrando outro Paciente","INFORMAÇÃO",JOptionPane.INFORMATION_MESSAGE);
        
        nome = JOptionPane.showInputDialog("Digite o nome do paciente");
        rg = JOptionPane.showInputDialog("Digite o rg completo do paciente "+nome);
        endereco = JOptionPane.showInputDialog("Digite o endereco do "+nome);
        telefone = JOptionPane.showInputDialog("Digite o telefone do usuario "+nome);
        profissao = JOptionPane.showInputDialog("Digite a profissao de "+nome);
        anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Por fim o ano de nascimento"));
        
        Paciente p2 = new Paciente(nome);
        p2.cadastraDados(nome, rg, endereco, telefone, anoNascimento, rg);
        p2.rg = rg;
        p2.endereco = endereco;
        p2.telefone = telefone;
        p2.profissao = profissao;
        p2.anoNascimento = anoNascimento;
        
        year = LocalDateTime.now();
        idade = p2.calculaIdade(year.getYear());
        p2.imprimeDados(idade);
    }
}
