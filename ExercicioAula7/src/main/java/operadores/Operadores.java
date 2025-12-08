/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operadores;

import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class Operadores {
    
    public static void main(String[] args){
        
        Scanner leitor = new Scanner(System.in);
        
        /*System.out.println("Digite o 1° valor:");
        int v1 = leitor.nextInt();
        System.out.println("Digite o 2° valor:");
        int v2 = leitor.nextInt();
        int s = v1 + v2;
        int subt = v1 - v2;
        int mult = v1 * v2;
        int div = v1 / v2;
        System.out.println("Resultado soma: "+ s);
        System.out.println("Resultado subtração: "+ subt);
        System.out.println("Resultado multiplicação: " + mult);
        System.out.println("Resultado divicao: " + div);*/
        
        /*System.out.println("Digite a 1° nota: ");
        double n1 = leitor.nextDouble();
        System.out.println("Digite a 2° nota: ");
        double n2 = leitor.nextDouble();
        System.out.println("Digite a 3° nota: ");
        double n3 = leitor.nextDouble();
        System.out.printf("A media aritmetrica e %.2f%n", (n1 + n2 + n3) / 3);
        System.out.printf("A media penderada e %.2f%n", (n1*5 + n2*3 + n3*2) / 10);*/
        
        /*System.out.println("Digite um valor: ");
        int n1 = leitor.nextInt();
        System.out.println("Digite um valor: ");
        int n2 = leitor.nextInt();
        System.out.println("Digite um valor: ");
        int n3 = leitor.nextInt();
        System.out.println("Digite um valor: ");
        int n4 = leitor.nextInt();
        System.out.println("Valor pos incremento pre-fixado: " + (n1 + ++n1));
        System.out.println("Valor pos incremento pos-fixado: " + (n1 + n2++));
        System.out.println("Valor pos decremento pre-fixado: " + (n1 + --n3));
        System.out.println("Valor pos decremento pos-fixado: " + (n1 + n4--));*/
        
        /*System.out.println("Digite 1° valor: ");
        int x = leitor.nextInt();  
        
        x += 5;
        System.out.println("Apos x += 5 -> valor de x: " + x);
        x -= 3;
        System.out.println("Apos c -= 3 -> o valor de x: " + x);
        x *= 2;
        System.out.println("Apos x *= 2 -> o valor de x: " + x);
        x /= 4;
        System.out.println("Apos x /= 4 -> o valor de x:" + x);*/
        
        /*System.out.println("Digite o 1° valor: ");
        int n1 = leitor.nextInt();
        System.out.println("Digite o 2° valor: ");
        int n2 = leitor.nextInt();
        int r = n1%n2;
        System.out.println("O resto do valor " +n1+ " e " +n2+ " igual 1" + r);*/
        
        /*System.out.println("Digite um valor: ");
        double n = leitor.nextDouble();
        
        double r = Math.sqrt(n);
        System.out.printf("A raiz de %.2f e igual %f", n, r);*/
        
        /*System.out.println("Digite um numero base: ");
        double x = leitor.nextDouble();
        System.out.println("Digite um numero expoente: ");
        double y = leitor.nextDouble();
        
        double z = Math.pow(x, y);
        System.out.printf("Base %.1f elevado ao expoente %.1f e igual a %.4f", x,y,z);*/
        
        /*System.out.println("Digite um valor: ");
        double n = leitor.nextDouble();
        
        double a = Math.floor(n);
        double b = Math.ceil(n);
        long c = Math.round(n);
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);*/
        
        /*System.out.println("Digite um valor: ");
        double n = leitor.nextDouble();
        
        double a = Math.abs(n);
        System.out.printf("O valor absoluto de %.1f e %.1f", n, a);*/
        
        System.out.println("Digite o 1° valor: ");
        double a = leitor.nextDouble();
        System.out.println("Digite o 2° valor: ");
        double b = leitor.nextDouble();
        System.out.println("Digite o 3° valor: ");
        double c = leitor.nextDouble();
        
        double r = ((a + b) / c)+ Math.sqrt(Math.abs(a - b)) + (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
        
        System.out.printf("%.2f", r);
    }
    
}
