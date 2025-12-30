/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.bryan.testefuncao02;

/**
 *
 * @author bryan
 */
public class TesteFuncao02 {

    static int soma(int a, int b){
        int s = a + b;
        return s;
    }
    
    public static void main(String[] args) {
        int resultado = soma(8, 2);
        System.out.println("Valor da soma: " + resultado);
    }
}
