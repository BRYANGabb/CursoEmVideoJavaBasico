/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.bryan.numeros;

import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class Numeros {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int n, s=0;
        String res;
        
        do{
            System.out.print("Digite um valor: ");
            n = ler.nextInt();
            s += n;
            System.out.print("Desejar continuar? [S/N] ");
            res = ler.next();
        } while(res.equalsIgnoreCase("S"));
        System.out.println("A soma de todos os valores e igual: " + s);
    }
}
