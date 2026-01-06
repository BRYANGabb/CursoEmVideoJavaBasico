/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.bryan.notaproc;

import java.util.Scanner;
/**
 *
 * @author bryan
 */
public class NotaProc {
    
    static float media(float n1, float n2, float n3){
        float m = (n1 + n2 + n3) / 3;
        return m;
    }
    
    static void situacaoAluno(float n1, float n2, float n3){
        float m = (n1 + n2 + n3) / 3;
        
        System.out.printf("Media: %.2f\n", m);
        
        if (m >= 7){
            System.out.println("APROVADO");
        } else if (m >= 4) {
            System.out.println("RECUPERAÇÃO");
        } else {
            System.out.println("REPROVADO");
        }
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite a 1º nota: ");
        float nota1 = ler.nextFloat();
        
        System.out.print("Digite a 2º nota: ");
        float nota2 = ler.nextFloat();
        
        System.out.print("Digite a 3° nota: ");
        float nota3 = ler.nextFloat();
        
        situacaoAluno(nota1, nota2, nota3);
        float res = media(nota1, nota2, nota3); 
    }
}
