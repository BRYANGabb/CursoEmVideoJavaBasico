/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.bryan.programamedia;

import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class ProgramaMedia {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite a 1° nota: ");
        float n1 = ler.nextFloat();
        System.out.print("Digite a 2° nota: ");
        float n2 = ler.nextFloat();
        
        float m = (n1 + n2) / 2;
        System.out.println("Sua media foi " + m);
        
        if (m >9){
            System.out.println("Parabens!!!");
        }
    }
}
