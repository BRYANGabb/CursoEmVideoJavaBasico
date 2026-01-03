/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.bryan.funcao01;

import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class Funcao01 {

    static int maior(int a, int b){
        int m = a;
        
         if (b > a){
             m = b;
         }
         return m;
    }
    
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        System.out.println("Digite o 1º valor: ");
        int num1 = ler.nextInt();
        
        System.out.println("Digite o 2º valor: ");
        int num2 = ler.nextInt();
        
        int resultado = maior(num1, num2);
        System.out.println("Maior valor: " + resultado);
    }
}
