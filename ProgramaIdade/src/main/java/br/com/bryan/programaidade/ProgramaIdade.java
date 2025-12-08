/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.bryan.programaidade;

import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class ProgramaIdade {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual o ano do seu nascimento? ");
        int nasc = ler.nextInt();
        
        int i = 2025 - nasc;
        System.out.println("Sua idade é " + i);
        
        if (i >= 18) {
            System.out.println("Maior de Idade");
        } else {
            System.out.println("Menor de Idade");
        }
    }
}
