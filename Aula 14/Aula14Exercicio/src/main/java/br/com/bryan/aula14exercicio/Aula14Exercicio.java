/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.bryan.aula14exercicio;

import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class Aula14Exercicio {

    public static void main(String[] args) {
        
        /*int n[] = {8,2,3,4,5};
        
        for(int i = 0; i < n.length; i++){
            System.out.println("Posição " + i + " = " + n[i]);
        }*/
        
        /*String nome[] = {"Bryan", "Gabriel", "Rickson", "Alice"};    
        
        for (int i = 0; i < nome.length; i++){
            System.out.println("Posição " + i + " = " + nome[i]);
        }*/
        
        /*Scanner ler = new Scanner(System.in);
        
        int num[] = new int[5];
        int soma=0;
        int cc =0;
        
        float media =0;
        
        for (int i = 0; i < num.length; i++){
            System.out.println("Digite um valor: ");
            num[i] = ler.nextInt();
            
            cc++;
            soma += num[i];
        } 
        media = (float) soma / cc;
        
        System.out.println("Valor da soma: " + soma);
        System.out.println("Valor da media: " + media);
        
        for (int j = 0; j < num.length; j++){
            System.out.print(num[j] + " ");
        }*/
        
        /*Scanner ler = new Scanner(System.in);
        
        int num[] = new int [6];
        
        for (int i =0; i < num.length; i++){
            System.out.print("Digite o valor da posição " + i +" : ");
            num[i] = ler.nextInt();
            
        }
        ler.close();
        
        int maiorNum = num[0];
        int menorNum = num[0];
        
        for (int i =0; i < num.length; i++){
            
            
            if (num[i] > maiorNum){
                maiorNum = num[i];
            }
            
            if (num[i] < menorNum){
                menorNum = num[i];
            }
        }
        System.out.println("Maior valor: " + maiorNum);
        System.out.println("Menor valor: " + menorNum);*/
        
        /*int n[] = {8,55,7,4,10,9,45,3,7,4};
        
        int nPar=0;
        int nImpar=0;
        
        for (int i: n){
            if(i % 2 ==0){
                System.out.print(i + " ");
                nPar++;
            } else{
                System.out.print(i + " ");
                nImpar++;
            }
        }
        System.out.println("");
        System.out.println("Existem numeros Pares: " + nPar);
        System.out.println("Existem numeros Impares: " + nImpar);*/
        
        Scanner ler = new Scanner(System.in);
        
        String aluno[] = new String[5];
        
        for(int i =0; i < aluno.length; i++){
            System.out.print("Digite o nome do "+ (i + 1) +"º aluno: ");
            aluno[i] = ler.nextLine();
        }
        System.out.println("");
        
        float nota[] = new float[5];
        float media = 0;
        float soma = 0;
        
        for (int i =0; i < nota.length; i++){
            System.out.print("Digite a nota do aluno(a) " + aluno[i] + ": ");
            nota[i] = ler.nextFloat();
            soma += nota[i];
        }
        System.out.println("");
        
        media = (float) soma / nota.length;
        if (media > 0){
            System.out.printf("Media dos alunos: %.2f", media);
            System.out.println("");
            System.out.println("ACIMA DA MEDIA");
            for (int i = 0; i < nota.length; i++){
                if (nota[i] >= media){
                    System.out.println(aluno[i] + ": " + nota[i]);
                }
            }
        } 
        System.out.println("");
        
        if (media > 0){
            System.out.println("ABAIXO DA MEDIA");
            for (int i = 0; i < nota.length; i++){
                if (nota[i] < media){
                    System.out.println(aluno[i] + ": " + nota[i]);
                }
            }
        }
    }
}
