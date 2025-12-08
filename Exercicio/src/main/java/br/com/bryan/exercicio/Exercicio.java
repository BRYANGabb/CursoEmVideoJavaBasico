/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.bryan.exercicio;

import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class Exercicio {

    public static void main(String[] args) {
        /*Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int n1 = teclado.nextInt();
        System.out.println("Digite outro valor: ");
        int n2 = teclado.nextInt();
        System.out.println("A soma e ", n1 + n2);*/
        
       /* Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a 1° nota do aluno: ");
        float nota1 = teclado.nextFloat();
        System.out.println("Digite a 2° nota do aluno: ");
        float nota2 = teclado.nextFloat();
        System.out.println("A media do aluno e " + ((nota1 + nota2) / 2));*/
       
       /*Scanner teclado = new Scanner(System.in);
        System.out.println("Convertor de Celseius para Fahrenheit");
        System.out.println("Digite a temperatura em Celsius: ");
        float C = teclado.nextFloat();
        System.out.println("A temperatura em fahrenheit e " + ((9 * C) / 5 + 32));*/
       
       /*Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = teclado.nextLine();
        System.out.printf("Ola, %s, Seja bem vindo", nome);*/
       
       Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = teclado.nextLine();
        System.out.printf("%s, digite sua idade: ", nome);
        int idade = teclado.nextInt();
        if (idade >= 18){
            System.out.printf("%s, voce e maior de idade\n", nome);
        }else{
            System.out.printf("%s, voce e menor de idade\n", nome);
        }
     }
}