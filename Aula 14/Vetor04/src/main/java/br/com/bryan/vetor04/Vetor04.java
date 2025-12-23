/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.bryan.vetor04;

import java.util.Arrays;

/**
 *
 * @author bryan
 */
public class Vetor04 {

    public static void main(String[] args) {
        
        int vet[] = {2, 8, 9, 15};
        
       for (int vetor: vet){
           System.out.println(vetor);
       }
        System.out.println("");
        int p = Arrays.binarySearch(vet, 8);
        System.out.println("Encontrei o valor na posição " + p);
    }
}
