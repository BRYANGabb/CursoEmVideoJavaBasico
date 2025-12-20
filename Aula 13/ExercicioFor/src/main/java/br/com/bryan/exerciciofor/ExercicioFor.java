/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.bryan.exerciciofor;

import javax.swing.JOptionPane;
/**
 *
 * @author bryan
 */
public class ExercicioFor {

    public static void main(String[] args) {
        
        /*for(int i =1; i >=5; i++){
            System.out.print(i + " ");
        }*/
        
        /*for(int i =5; i >=1; i--){
            System.out.print(i + " ");
        }*/
        
        /*for(int i=0; i<=10; i++){
            if (i % 2 ==0){
                System.out.println(i + " ");
            }
        }*/
        
        /*for (int i=0; i <=20; i+=5){
            System.out.print(i + " ");
        }*/
        
        /*for(int i=100; i>=60; i-=10){
            System.out.print(i + " ");
        }*/
        
        /*for (int i =1; i <=20; i++){
            if (i % 2 == 1){
                System.out.print(i + " ");
            }
        }*/
        
        /*int qtdImpar=0, qtdPar=0, n;
        
        for (int i =1; i <=5; i++){
             n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o " 
                    + i + "° valor: "));
             
            if (n % 2 == 0){
                qtdPar++;
            } else {
                qtdImpar++;
            }
        }
        JOptionPane.showMessageDialog(null, "<html>Quantidade Par: " + qtdPar 
                + "<br>Quantidade Impar: " + qtdImpar + "</html>");*/
        
        /*for (int i = 1; i <=50; i++){
            if ((i % 3== 0) && (i % 5 == 0)){
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }*/
        
        
        /*for (int i =1; i <= 3; i++){
            System.out.println("");
            for (int j =1; j <=3; j++){
                System.out.print(j + " ");
            }
        }*/
        
        /*int n =0;
        
        for (int i =1; i <=3; i++){
            for (int j=1; j<=2; j++){
                n+=1;
                System.out.print(n + " ");
            }
            System.out.println();
        }*/
        
        int tabuada=0;
        
        for (int i =1; i <=10; i++){
            for (int j =3; j <=3; j++){
                tabuada = i * j;
                System.out.println(j + " X " + i + " = " + tabuada);
            }
        }
    }
}
