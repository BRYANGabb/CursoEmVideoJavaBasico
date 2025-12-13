/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.bryan.contador3;

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
        
        int cc = 1;
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
        }
    }
}
