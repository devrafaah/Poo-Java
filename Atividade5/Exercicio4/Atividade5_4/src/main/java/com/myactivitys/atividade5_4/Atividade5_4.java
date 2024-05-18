/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.myactivitys.atividade5_4;

/**
 *
 * @author MobDi
 */
public class Atividade5_4 {

    public static void main(String[] args) {
        Vendedor v1 = new Vendedor(2000,1000,"Fabricio",0);
        v1.descontoFalta();
        v1.calcularComissao();
        v1.calculaSalario();
        v1.imprimirDados();
    }
}
