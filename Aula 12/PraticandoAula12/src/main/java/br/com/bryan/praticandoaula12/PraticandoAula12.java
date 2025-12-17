/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.bryan.praticandoaula12;

import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class PraticandoAula12 {

    public static void main(String[] args) {
        /*int cc = 10;
        
        do {
            System.out.println(cc);
            cc--;
        } while(cc >= 1);*/
        
        /*int cc = 0, mult3 = 0;
        
        do {
           
            System.out.println("3" + " x " + cc + "= " + mult3);
            mult3 += 3;
            cc++;
        } while (mult3 <= 30);*/
        
        /*Scanner ler = new Scanner(System.in);
        
        int num, qtdPar=0, qtdImpar=0;
        
        do {
            System.out.print("Digite um valor: ");
            num = ler.nextInt();
            
            if (num != 0){
                if (num % 2 == 0){
                    qtdPar++;
                } else{
                    qtdImpar++;
                }
            }
            
        }while (num != 0);
        
        System.out.println("Quantidade de valores pares: " + qtdPar);
        System.out.println("Quantidade de valores impares: " + qtdImpar);*/
        
        /*Scanner ler = new Scanner(System.in);
        
        int nota;
        
        do {
            System.out.print("Digite uma nota: (0 a 10) ");
            nota = ler.nextInt();
            
        } while(nota <0 || nota >10);*/
        
        /*Scanner ler = new Scanner(System.in);
        
        int menu;
        
        do {
            System.out.println("1- Ola: ");
            System.out.println("2- Mostrar Hora: ");
            System.out.println("3- Sair");
            menu = ler.nextInt();
                    
            
        }while (menu != 3);*/
        
        Scanner ler = new Scanner(System.in);
        
        int nota, soma=0, qtd=0;
        float media;
        
        do{
            System.out.print("Digite uma nota: ");
            nota = ler.nextInt();
            if (nota != -1){
            
                qtd++;
            
                soma += nota;
            }
        }while(nota != -1);
        
        if (qtd > 0){
            media = (float) soma / qtd;
            System.out.printf("A media das notas: %.2f", media);
            System.out.println("Teve " +qtd+ " nota lida");
        
        }
    }
}
