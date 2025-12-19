/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.bryan.exerciciorepita;

import javax.swing.JOptionPane;
/**
 *
 * @author bryan
 */
public class ExercicioRepita {

    public static void main(String[] args) {
        
        int n, contador=0, qtdPar=0, qtdImpar=0, acimaCem=0, soma=0;
        float media=0;
        
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "<html>Informe um valor: <br><em>(valor 0 interrompe)</em></br></html>"));
            
            if (n != 0){
                contador++;
                soma += n;
                if (n % 2 == 0){
                    qtdPar++;
                } else {
                    qtdImpar++;
                }
                if (n > 100){
                    acimaCem++;
                }
            }
        } while(n != 0);
        media = (float) soma / contador;
        
        JOptionPane.showMessageDialog(null, "<html>Resultado:<br><hr>" + 
                "Total de Valores: " + contador + 
                "<br> Total de Pares: " + qtdPar +
                "<br> Total de Impares: " + qtdImpar + 
                "<br> Acima de 100: " + acimaCem + 
                "<br> Media dos Valores: " + media + "</html>");
        
    }
}
