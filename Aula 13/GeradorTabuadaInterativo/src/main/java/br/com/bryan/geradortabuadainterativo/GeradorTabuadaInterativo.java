/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.bryan.geradortabuadainterativo;

import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author bryan
 */
public class GeradorTabuadaInterativo {

    public static void main(String[] args) {
        
        String option;
        
        do {
            int tabuada=0;
            String resultado = "";
            
            int n = Integer.parseInt(
                    JOptionPane.showInputDialog(null, "Digite um número para tabuada: "));
            
            
            for (int i = 1; i <=10; i++){
                tabuada = n * i;
          
               resultado += n + " X " + i + " = " + tabuada + "<br>";
           }
            JOptionPane.showMessageDialog(null, "<html> Tabuada do " + n + "<br><hr>" + resultado + "</html>");
            
            option = JOptionPane.showInputDialog(null, "Desejar fazer outra tabuada: (Sim/Não) ");
            
        } while (option.equalsIgnoreCase("Sim"));
    } 
}
