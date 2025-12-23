/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.bryan.vetor02;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author bryan
 */
public class Vetor02 {

    public static void main(String[] args) {
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun",
                        "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 30, 30, 31, 30, 31};
      
        int ano = LocalDate.now().getYear();
        System.out.println(ano);
        
        if (ano % 400 == 0){
                tot[1]++;
            } else if (ano % 100 == 0) {
                
            } else if (ano % 4 == 0){
                tot[1]++;
            } else {
                
        }
        
        for(int cc = 0; cc < tot.length; cc++){
            System.out.println("O mês de " + mes[cc] + " tem " + tot[cc] + " dias.");
            
              
        }
    }
}