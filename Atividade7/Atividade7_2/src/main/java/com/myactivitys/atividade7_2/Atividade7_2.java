/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.myactivitys.atividade7_2;

import javax.swing.JOptionPane;

/**
 *
 * @author MobDi
 */
public class Atividade7_2 {

    public static void main(String[] args) {
        Gerente admin = new Gerente(123,2);
        Funcionario f2 = new Funcionario();
        f2.setNome("Rafael");
        f2.setCpf("50194528402");
        f2.setSalario(3000);
        
        int codeAcess = Integer.parseInt(JOptionPane.showInputDialog("Digite seu codigo de acesso"));
        
        if(codeAcess != admin.getSenha()){
            String nome,cpf;
            double salario;
            JOptionPane.showMessageDialog(null, "Verificamos que você nao possui uma PASSWORD vamos cadastra-lo insira os dados a seguir....");
            
            nome = JOptionPane.showInputDialog("Digite seu nome");
            cpf = JOptionPane.showInputDialog("Digite seu CPF");
            salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salario"));
            
            Funcionario f1 = new Funcionario(nome,cpf,salario);
            
            JOptionPane.showMessageDialog(null,"Bom dia, "+f1.getNome());
            
            while(true) {
            int tipo = Integer.parseInt(JOptionPane.showInputDialog("Selecione a opcao desejada"+
                    "\n1 - Verificar Bonificação"+
                    "\n2 - Verificar Autenticacao"+
                    "\n3 - Sair"));
            
            switch(tipo){
                case 1:
                    int qtd = admin.getFuncionariosGerenciados();
                    admin.setFuncionariosGerenciados(qtd + 1);
                    JOptionPane.showMessageDialog(null, "Minha Bonificacao: "+f1.bonificacao());
                    break;
                    
                case 2:
                    boolean myAuth = f1.autentica();
                    JOptionPane.showMessageDialog(null,"Autenticacao: "+myAuth);
                    break;
                case 3:
                    System.out.println("Bye Bye");
                    System.exit(0);
            }
            
            
        }
        }else{
            // menu de administrador
            JOptionPane.showMessageDialog(null, "Bom dia Gerente");
            while(true) {
            int tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite a opcao desejada"+
                    "\n1 - Adicionar funcionario"+
                    "\n2 - Verificar qantidade funcionarios"+
                    "\n3 - Sair"));
            
            switch(tipo){
                case 1:
                    String nome,cpf;
                    double salario;
                    nome = JOptionPane.showInputDialog("Digite o nome do Funcionario");
                    cpf = JOptionPane.showInputDialog("Digite o cpf do Funcionario");
                    salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario do Funcionario"));
                    
                    Funcionario f = new Funcionario(nome,cpf,salario);
                    f.autentica();
                    int qtd = admin.getFuncionariosGerenciados();
                    admin.setFuncionariosGerenciados(qtd + 1);
                    JOptionPane.showMessageDialog(null, "Dados do usuario cadastrado"+
                            "\nNome: "+f.getNome()+
                            "\nCpf: "+f.getCpf()+
                            "\nSalario: "+f.getSalario()+
                            "\n-----------------------------------------"+
                            "\nAutorizacao: "+f.autentica()+
                            "\nBonificacao: R$"+f.bonificacao());
                    break;
                case 2:
                    int qtdFun = admin.getFuncionariosGerenciados();
                    JOptionPane.showMessageDialog(null,"Quantidade de Funcionarios: "+qtdFun);
                    break;
                case 3:
                    System.out.println("Bye Bye");
                    System.exit(0);
            }
            
            
        }
        }
        
        
    }
}
