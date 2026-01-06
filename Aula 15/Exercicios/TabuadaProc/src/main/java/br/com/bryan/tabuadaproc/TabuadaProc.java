/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.bryan.tabuadaproc;

import java.util.Scanner;

public class TabuadaProc {

    static void tabuada(int a){
    for (int i = 1; i <= 10; i++){
        System.out.println(a + " X " + i + " = " + (a * i));
    }
}
    
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        System.out.println("Qual tabuada deseja? 1 a 10 ");
        int num = ler.nextInt();
        
        tabuada(num);
    }
}
