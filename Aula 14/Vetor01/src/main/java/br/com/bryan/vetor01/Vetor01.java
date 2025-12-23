/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.bryan.vetor01;

/**
 *
 * @author bryan
 */
public class Vetor01 {

    public static void main(String[] args) {
        int n[] = {3, 4, 6, 7};
        
        System.out.println("Total de casas de N " + n.length);
        
        for (int cc = 0; cc <= n.length-1; cc++){
            System.out.println("Na posição " +cc+ " temos "+ n[cc]);
        }
    }
}
