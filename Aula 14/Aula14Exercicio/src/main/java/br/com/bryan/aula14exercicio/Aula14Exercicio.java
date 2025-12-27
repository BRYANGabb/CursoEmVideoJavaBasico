/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.bryan.aula14exercicio;

import java.time.LocalDate;
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
        
        /*Scanner ler = new Scanner(System.in);
        
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
        }*/
        
        /*Scanner ler = new Scanner(System.in);
        
        int n[] = {8, 10, 9, 2, 4, 15, 20, 4};
        
        int val;
        
        System.out.println("Digite um valor: ");
        val = ler.nextInt();
        
        boolean resultado = false;
        
        for (int i = 0; i < n.length; i++){
            if (n[i] == val){
                resultado = true;
                System.out.println("Valor na posição: " + i);
            }  
        }
        if (resultado == true){
            System.out.println("Numero encontrado");
        } else {
            System.out.println("Numero nao encontrado");
        }*/
        
        /*String mes[] = {"Jan","Fev","Mar","Abr","Mai","Jun",
            "Jul","Ago","Set","Out","Nov","Dez"};
        
        int dia[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int ano = LocalDate.now().getYear();
        
        if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)){
            dia[1]++;
        }
        
        for (int i = 0; i < mes.length; i++){
            System.out.println(mes[i] + ": " + dia[i]);
        }
        System.out.println("");
        
        Scanner ler = new Scanner(System.in);
        
        int dataMes;
        
        System.out.print("Digite a data do mês: (1 a 12) ");
        dataMes = ler.nextInt();
        
        dataMes--;
            
        if (dataMes >= 0 && dataMes < mes.length){
            System.out.println(mes[dataMes] + ": " + dia[dataMes]);
        } else{
            System.out.println("Mês Invalido!");
        }*/
    }
}
