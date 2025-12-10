/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.bryan.programapernas;

import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class ProgramaPernas {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Quantas pernas?");
        int perna = ler.nextInt();
        System.out.print("Isso é um(a): ");
        String tipo;
        
        switch (perna){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6, 8:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
        }
        System.out.print(tipo);
    }
}
