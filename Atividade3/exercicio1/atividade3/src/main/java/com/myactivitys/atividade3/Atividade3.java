/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.myactivitys.atividade3;

import java.time.LocalDateTime;
import javax.swing.JOptionPane;

/**
 *
 * @author MobDi
 */
public class Atividade3 {

    public static void main(String[] args) {
        String dia,mes,ano;
        float base,altura;
        
        Triangulo t = new Triangulo();
        base = Float.parseFloat(JOptionPane.showInputDialog("Digite a base do triangulo"));
        altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura do triangulo"));
        t.base = base;
        t.altura = altura;
        t.calcularArea(base, altura);
        System.out.println(t.imprimirDados());
        
        JOptionPane.showMessageDialog(null, "Agora.... A data de criação do primeiro triangulo",
                                          "INFORMAÇÃO",
                                          JOptionPane.INFORMATION_MESSAGE);
        
        
        Data d = new Data();
        dia = JOptionPane.showInputDialog("Digite o dia atual da criação do triangulo");
        mes = JOptionPane.showInputDialog("Digite o mes atual da criação do triangulo");
        ano = JOptionPane.showInputDialog("Digite o ano atual da criação do triangulo");
        d.dia = Integer.parseInt(dia);
        d.mes = Integer.parseInt(mes);
        d.ano = Integer.parseInt(ano);
        d.imprimirDados();
        
        JOptionPane.showMessageDialog(null, "Agora.... Preencha dados para criação do segundo triangulo",
                                          "INFORMAÇÃO",
                                          JOptionPane.INFORMATION_MESSAGE);
        
        
        
        base = Float.parseFloat(JOptionPane.showInputDialog("Digite a base do triangulo"));
        altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura do triangulo"));
        Triangulo t2 = new Triangulo(base,altura);
        t2.calcularArea(base, altura);
        System.out.println(t2.imprimirDados());
        
        
        JOptionPane.showMessageDialog(null, "Agora.... A data da criação do segundo triangulo Automatico",
                                          "INFORMAÇÃO",
                                          JOptionPane.INFORMATION_MESSAGE);
        
        // conversao da hora atual para classe
        // explicação: utilizando a LocalDateTime.now consigo
        // armazenar a data atual. acessando o objeto agora consigo metodos
        // de DIA / MES / ANO do sistema. BEM UTIL !!
        Data d2 = new Data();
        // data/hora atual
        LocalDateTime agora = LocalDateTime.now();
        d2.cadastrarDados(agora.getDayOfMonth(), agora.getMonthValue(), agora.getYear());
        d2.imprimirDados();
        
    }
}
