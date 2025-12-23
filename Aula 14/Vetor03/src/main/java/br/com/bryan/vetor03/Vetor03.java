/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.bryan.vetor03;

import java.util.Arrays;

/**
 *
 * @author bryan
 */
public class Vetor03 {

    public static void main(String[] args) {
        
        double v[] = {8.5, 6, -4.444, 5.9};
        
        Arrays.sort(v);
        
        for (double valor: v){
            System.out.println(valor + " ");
        }
    }
}
