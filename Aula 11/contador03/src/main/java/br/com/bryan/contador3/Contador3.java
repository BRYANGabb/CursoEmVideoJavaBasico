/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.bryan.contador3;

import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class Contador3 {

    public static void main(String[] args) {
        /*int cc = 0;
        while (cc <= 20){
            cc++;
            if (cc % 2 == 0){
                System.out.print(cc + " ");
            }
            continue;
        }*/
        
        /*int cc = 0;
        while (cc < 20){
            cc++;
            if(cc % 2 == 0){
                System.out.println(cc + "PAR");
            } else {
                System.out.println(cc + "IMPAR");
            }
        }*/
        
        /*int cc = 50;
        while (cc >= 0){
            System.out.print(cc + " ");
            cc -= 5;
        }*/
        
        /*int cc = 1;
        while (cc <= 15){
    
            if (cc % 3 == 0 && cc % 5 == 0){
                System.out.println("FizzBuzz");    
            } else if (cc % 3 == 0) {
                System.out.println("Fizz");
            } else if (cc % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(cc);
            }
            cc++;
        }*/
        
        /*int soma = 0;
        int cc = 0;
        while (cc < 100){
           
            cc++;
            soma += cc;
            System.out.println(cc);
            
        }
        System.out.println("Soma de todos os numeros: " + soma);*/
        
        /*Scanner ler = new Scanner(System.in);
       
        int num = 1;
        int soma = 0;
        
        while (num != 0){
            System.out.println("Digite um valor: ");
            num = ler.nextInt();
            soma += num;
        }
        System.out.println("Valor de todos numeros digitados: " + soma);*/
        
        /*Scanner ler = new Scanner(System.in);
        
        int num = 1;
        int somaPar = 0;
        int somaImpar = 0;
        
        while (num != 0){
        
            System.out.println("Digite um valor: ");
            num = ler.nextInt();
            
            if (num != 0){
                
            if (num % 2 == 1) {
                somaImpar += num;
            } else {
                somaPar += num;
            }
            }
        }
        System.out.println("Soma de todos numeros Par: " + somaPar);
        System.out.println("Soma de todos numeros Impar: " + somaImpar);*/
        
        /*Scanner ler = new Scanner(System.in);
        
        int nota = 0;
        int m = 0;
        int soma = 0; 
        
        while (nota != -1){
            
            System.out.println("Digite uma nota: (0 a 10)");
            nota = ler.nextInt();
                
            if (nota >= 0 && nota <= 10){
            
                soma += nota;
                m++;
                
            }
        }
        if (m > 0){
            System.out.println("Media das notas: " + (soma / m));
        } else {
            System.out.println("Nenhum valor valido foi digitado!");
        }*/
        
        /*Scanner ler = new Scanner(System.in);
        
        String senha = "";
        
        while (!senha.equals("1234")){
            System.out.println("Digite a senha: ");
            senha = ler.nextLine();
            
        }
        System.out.println("Acesso permitido!");
    }*/
        
        /*Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite um valor: (0 encerra o programa) ");
        int val = ler.nextInt();
        
        if (val != 0){
            int maior = val;
            int menor = val;
        
            while(val != 0){
                System.out.println("Digite um valor: (0 encerra o programa) ");
                val = ler.nextInt();
                if (val != 0){
                    if (val > maior){
                        maior = val;
                    } else if (val < menor) {
                        menor = val;
                    }
                }
            }
            System.out.println("Maior valor digitado: " + maior);
            System.out.println("Menor valor digitado: " + menor);
        }
        System.out.println("Programa encerrado!");*/
        
        /*Scanner ler = new Scanner(System.in);
        int menu = 0;
        
        while (menu != 3){
            System.out.println("1- soma");
            System.out.println("2- subtrair");
            System.out.println("3- sair");
            menu = ler.nextInt();
            
            switch(menu){
                case 1:
                    System.out.println("Digite 1° valor: ");
                    int num1 = ler.nextInt();
                    System.out.println("Digite 2º valor: ");
                    int num2 = ler.nextInt();
                    int soma = num1 + num2;
                    System.out.println("Valor da soma: "+ soma);
                    break;
                    
                case 2: 
                    System.out.println("Digite 1° valor: ");
                    int n1 = ler.nextInt();
                    System.out.println("Digite 2º valor: ");
                    int n2 = ler.nextInt();
                    int sub = n1 - n2;
                    System.out.println("Valor da subtracao: " + sub);
                    break;
                    
                case 3:
                    System.out.println("Menu Encerrado!");
                    break;
                    
                default:
                    System.out.println("Opção Invalida!");*/
        
        Scanner ler = new Scanner(System.in);
        
        int idade = 0;
        int cad = 0;
        int soma = 0;
        int m = 0;
        int maior = 0;
        
        while (idade != -1){
            System.out.println("Digite sua idade: ");
            idade = ler.nextInt();
            if (idade != -1){
                cad++;
                soma += idade;
            
                if (idade > 18){
                    maior++;
                }
            }
        }
        
        if (cad > 0){
        m = soma / cad;
        System.out.println("Media das idades: " + m);
        System.out.println("Foram cadastradas " + cad + " pessoas");
        System.out.println("Quantas pessoas tem mais de 18 anos: " + maior);
        } else {
            System.out.println("Nenhum pessoa foi cadastrada!");
        }
}
}