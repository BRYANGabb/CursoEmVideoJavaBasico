/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.bryan.mostrarintervaloproc;

import java.util.Scanner;
/**
 *
 * @author bryan
 */
public class MostrarIntervaloProc {
    
    static void intervalo(int in, int fim){
        while (in <= fim){
            System.out.print(in++ + " ");
        }
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Contagem com intervalo");
        
        System.out.print("Digite o valor do inicio: ");
        int valIn = ler.nextInt();
        
        System.out.print("Digite o valor do fim: ");
        int valFim = ler.nextInt();
        
        intervalo(valIn, valFim);
    }
}
