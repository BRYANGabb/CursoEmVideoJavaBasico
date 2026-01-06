/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.bryan.verificarnumeroproc;

import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class VerificarNumeroProc {

    static void num(int a){
        
        if (a > 0){
                System.out.println("Positivo");
        } else if (a < 0) {
                System.out.println("Negativo");
        } else {
            System.out.println("Valor 0");
        }
    }
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int num = ler.nextInt();
        
        num(num);
    }
}
