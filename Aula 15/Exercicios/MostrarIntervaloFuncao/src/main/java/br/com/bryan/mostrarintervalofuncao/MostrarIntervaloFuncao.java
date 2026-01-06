/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.bryan.mostrarintervalofuncao;

import java.util.Scanner;
/**
 *
 * @author bryan
 */
public class MostrarIntervaloFuncao {
    
    static String intervalo(int in, int fim){
        String res = "";
        while (in < fim){
            res = res + in + " ";
            in++;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite o valor do inicio: ");
        int valIn = ler.nextInt();
        
        System.out.print("Digite o valor do fim: ");
        int valFim = ler.nextInt();
        
        String res = intervalo(valIn, valFim);
        System.out.println(res);
    }
}
