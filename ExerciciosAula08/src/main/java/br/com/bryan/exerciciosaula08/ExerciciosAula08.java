/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.bryan.exerciciosaula08;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class ExerciciosAula08 {

    public static void main(String[] args) {
        /*Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu ano de nascimento: ");
        int ano = ler.nextInt();
        int idade = LocalDate.now().getYear()- ano;
        String sit = (idade >= 18)?"Maior de idade":"Menor de idade";
        System.out.println(sit);*/
        
        /*Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = ler.nextInt();
        String sit = (num % 2 == 0)?"Par":"Impar";
        System.out.println(sit);*/
        
        /*Scanner ler = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int val = ler.nextInt();
        String entre = (val >= 0 && val <= 120)?"SIM":"NÃO";
        System.out.println("O valor esta entre 0 a 120: " + entre);*/
        
        /*Scanner ler = new Scanner(System.in);
        System.out.println("Digite uma nota: ");
        double nota = ler.nextDouble();
        String entre = (nota >= 0 && nota <= 10)?"Valida":"Invalida";
        System.out.println("A nota é "+ entre);*/
        
        /*Scanner ler = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = ler.nextInt();
        if (idade < 16){
            System.out.println("Não vota");
        }
        else if ((idade >= 16 && idade < 18) || (idade > 70)){
        System.out.println("Voto opcional");
    }
        else {
        System.out.println("Voto obrigatorio");
    }*/
        /*Scanner ler = new Scanner(System.in);
        System.out.println("Digite o 1° valor");
        int a = ler.nextInt();
        System.out.println("Digite o 2° valor");
        int b = ler.nextInt();
        System.out.println("Digite o 3° valor");
        int c = ler.nextInt();
        
        String tri = (a < b + c) && (b < a + c) && (c < a + b)?"Forma um triângulo":"Não forma um triângulo";
        System.out.println(tri);*/
        
        /*Scanner ler = new Scanner(System.in);
       
        System.out.println("Digite 1° a nota: ");
        double n1 = ler.nextDouble();
        System.out.println("Digite 2° a nota: ");
        double n2 = ler.nextDouble();
        System.out.println("Digite 3° a nota: ");
        double n3 = ler.nextDouble();
        double m = (n1+n2+n3)/3;
        
        if (m >= 7){
            System.out.println("Aptovado!");
        } else if (m >= 5 && m <7){
            System.out.println("Recuperação");
        } else {
        System.out.println("Reprovado");
    }*/
        
        /*Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite seu usuario: ");
        String user = scanner.nextLine();
        System.out.println("Digite sua senha: ");
        String senha = scanner.nextLine();
        
        String userval = "admin";
        String senhaval = "123";
        
        String login = (user.equals(userval) && senha.equals(senhaval))?"Login permitido":"Login negado";
        System.out.println(login);*/
        
        /*Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite uma velocidade: ");
        int vel = ler.nextInt();
        
        if (vel > 80){
            System.out.println("Muito rapido");
        }
        else if (vel >=40 && vel <= 80){
            System.out.println("Velocidade normal");
        }
        else {
        System.out.println("Muito lento");
    }*/
        
        /*Scanner ler = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int val = ler.nextInt();
        
        String entre = (val >= 10 && val <= 100)
                ?"Esta entre 10 e 100"
                :"Não esta entre 10 e 100";
        
        String par = (val % 2 == 0)?"Par":"Impar";
        System.out.println(entre+" E é " + par);*/
        
        /*Scanner ler = new Scanner(System.in);
        System.out.println("Digite um ano: ");
        int ano = ler.nextInt();
        
        String bi = ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0))
                ?"O ano e bissexto"
                :"Nao e bissexto";
        System.out.println(bi);*/
        
        /*Scanner ler = new Scanner(System.in);
        System.out.println("Digite a velocidade do veiculo: ");
        int vel = ler.nextInt();
        
        System.out.println("Qual o limite da via: ");
        int limite = ler.nextInt();
        
        String multa = ((vel > limite) && ((vel - limite) > 10) )?"Sera multado":"Nao sera multado";
        System.out.println(multa);*/
        
        /*Scanner ler = new Scanner(System.in);
        System.out.println("Digite sua altura; ");
        float alt = ler.nextFloat();
        System.out.println("Digite seu peso: ");
        float peso = ler.nextFloat();
        
        float imc = peso / (alt * alt);
        System.out.println(imc);
        
        if (imc < 18.5){
            System.out.println("IMC baixo");
        } else if (imc >= 18.5 && imc < 25){
            System.out.println("IMC normal");
        } else if (imc >= 25 && imc < 30){
            System.out.println("IMC sobrepeso");
        } else {
        System.out.println("IMC obeso");
    }*/
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o 1° valor: ");
        int a = ler.nextInt();
        System.out.println("Digite o 2° valor: ");
        int b = ler.nextInt();
        System.out.println("Digite o 3° valor: ");
        int c = ler.nextInt();
        
        if (a < b + c && b < a + c && c < a + b){
            if (a == b && b==c){
                System.out.println("Triangulo equilatero");
            } else if (a == b || a == b || b ==c){
                System.out.println("Triangulo isosceles");
            } else {
            System.out.println("Triangulo escaleno");
        }
            
        } else {
            System.out.println("Não e um triangulo!");
        }
        
    }
    
}
