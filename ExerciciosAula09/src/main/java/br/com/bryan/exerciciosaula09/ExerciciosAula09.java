/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.bryan.exerciciosaula09;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class ExerciciosAula09 {

    public static void main(String[] args) {
        /*Scanner ler = new Scanner(System.in);
        System.out.print("Qual o seu ano de nascimento? ");
        int nasc = ler.nextInt();
        
        int idade = LocalDate.now().getYear() - nasc;
        System.out.println("Sua idade é " + idade);
        
        if (idade >= 18){
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }*/
        
        /*Scanner ler = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int val = ler.nextInt();
        
        if (val % 2 == 0){
            System.out.println("O numero " + val + " é Par");
        } else {
            System.out.println("O numero " + val + " é Impar");
        }*/
        
        /*Scanner ler = new Scanner(System.in);
        System.out.println("Qual é a sua idade? ");
        int idade = ler.nextInt();
        
        if (idade < 16){
            System.out.println("Não vota");
        } else if ((idade  >= 16 && idade < 18) || (idade >= 70)){
            System.out.println("Voto opcional");
        } else {
            System.out.println("Voto obrigatorio");
        }*/
        
        /*Scanner ler = new Scanner(System.in);
        System.out.println("Digite a 1° nota: ");
        float n1 = ler.nextFloat();
        System.out.println("Digite a 2° nota? ");
        float n2 = ler.nextFloat();
        float m = (n1 + n2) / 2;
        
        if (m >= 7){
            System.out.printf("Aluno aprovado com %.2f", m);
        } else if (m >= 5 && m <7){
        System.out.printf("Aluno em recuperação com %.2f", m);
    } else {
            System.out.printf("Aluno reprovado com %.2f", m);
    }*/

        /*Scanner ler = new Scanner(System.in);
        System.out.println("Digite o usuario: ");
        String user = ler.next();
        System.out.println("Digite sua senha: ");
        String senha = ler.next();
        
        if ((user.equals("admin")) && (senha.equals("1234"))){
            System.out.println("Login Aceito");
        } else {
            System.out.println("Login Negado");
        }*/
        
        /*Scanner ler = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = ler.nextInt();
        
        if (idade <= 9){
            System.out.println("Categoria Mirin com " + idade + " anos");
        } else if(idade > 9 && idade <= 14) {
            System.out.println("Categoria Infantil com " + idade + " anos");
        } else if (idade > 14 && idade <= 19){
            System.out.println("Categoria Junior com " + idade + " anos");
        } else if (idade > 19 && idade <= 25){
            System.out.println("Categoria Senior com " + idade + " anos");
        } else{
            System.out.println("Categoria Master com " + idade + " anos");
        }*/
        
        Scanner ler = new Scanner(System.in);
        System.out.println("Programa pensar em 1 ate 5, tentar acertar");
        int ale = (int) (1 + Math.random() * (6 - 1));
        
        System.out.println("Digite um valor: ");
        int val = ler.nextInt();
        
        if (val == ale) {
            System.out.println("Acertou!");
        } else {
            System.out.println("Errou! Pensei no valor " + ale);
        }
}
}
