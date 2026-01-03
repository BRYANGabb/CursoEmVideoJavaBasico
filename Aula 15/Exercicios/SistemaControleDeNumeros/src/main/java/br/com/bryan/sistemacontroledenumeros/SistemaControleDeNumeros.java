/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.bryan.sistemacontroledenumeros;

import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class SistemaControleDeNumeros {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        int n, soma=0, cc=0, qtdPar=0, qtdImpar=0, maiorCem=0;
        float media=0;
        
        do {
            System.out.println("Digite um valor: ");
            n = ler.nextInt();
            
            if (n != 0){
                cc++;
                soma += n;
                if (n % 2 ==0){
                    qtdPar++;
                } else {
                    qtdImpar++;
                }
                if (n > 100){
                    maiorCem++;
                }
            }
        }while(n != 0);
        if (cc > 0) {
            media = (float) soma / cc;
            System.out.println("Total de numeros digitados: " + cc);
            System.out.println("Soma dos valores: " + soma);
            System.out.println("Media; " + media);
            System.out.println("Quantidade de pares: " + qtdPar);
            System.out.println("Quantidade de impares: " + qtdImpar);
            System.out.println("Valor maior que 100: " + maiorCem);
        } else {
            System.out.println("Não houve valor valido!");
        }
    }
}
