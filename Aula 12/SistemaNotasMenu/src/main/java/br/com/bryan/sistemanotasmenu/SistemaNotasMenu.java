/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.bryan.sistemanotasmenu;

import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class SistemaNotasMenu {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int menu = 0, nota, soma=0, contador=0;
        float media=0;
        
        do {
            System.out.println("====== Menu ======");
            System.out.println("1 - Adicionar Nota ");
            System.out.println("2 - Mostrar Media ");
            System.out.println("3 - Mostrar Quantidade de Notas ");
            System.out.println("4 - Sair");
            menu = ler.nextInt();
            
            switch (menu){
                //adicionar nota
                case 1:
                do{
                    
                    System.out.print("Adicionar Nota: (0 a 10) ");
                    nota = ler.nextInt();
                    
                    if (nota <0 || nota > 10){
                        System.out.println("Nota Invalida!");
                    } else {
                        soma += nota;
                        contador++;
                    }
                    
                } while(nota < 0 || nota > 10);
                    break;
                
                // Media
                case 2:
                    if(contador > 0){
                    media = (float) soma / contador;
                        System.out.printf("Media: %.2f\n", media);
                    } else {
                        System.out.println("Nao teve nenhuma nota");
                    }
                    break;
                    
                // Quantidade
                case 3:
                    System.out.println("Quantidade de notas: " + contador);
                    break;
                    
                case 4: 
                    System.out.println("Encerrado!");
                    System.out.println("Ate a proxima");
                    break;
                
                default:
                    System.out.println("Opcao Invalida!");
            }
        } while(menu != 4);
    }
}
