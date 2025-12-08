/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.bryan.operadoresaritmeticos;

/**
 *
 * @author bryan
 */
public class OperadoresAritmeticos {

    public static void main(String[] args) {
       /* int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2)/2;
        System.out.println("A media e " + m);*/
       
       /*//operador unario
       int numero = 10;
       int valor = 4 + numero--;
        System.out.println(valor);
        System.out.println(numero);*/
       
      /* //operador atribuição
       int x = 5;
       x += 2; // x <- x + 2
        System.out.println(x);*/
      
      /*//Arredondamento
      //floor = Arredonda baixo
      //ceil = Arredonda cima
      //round = Arredonda aritmetricamente
      float v = 8.9f;
      int ar = (int) Math.floor(v);
        System.out.println(ar);*/
      
      //Gerador de Numeros
      double ale = Math.random();
      int n = (int) (1 + ale * (10 - 1));
        System.out.println(n);
      
    }
}
