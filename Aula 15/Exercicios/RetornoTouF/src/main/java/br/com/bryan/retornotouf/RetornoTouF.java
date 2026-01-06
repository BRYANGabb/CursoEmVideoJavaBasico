/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.bryan.retornotouf;
import java.util.Scanner;


public class RetornoTouF {

    static boolean retorno(int a){
        boolean res;
        if (a % 2 == 0){
            res = true;
        } else {
            res = false;
        }
        return res;
    }
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite um valor: ");
        int num = ler.nextInt();
        
        boolean res = retorno(num);
        System.out.println("O valor é par? " + res);
    }
}
