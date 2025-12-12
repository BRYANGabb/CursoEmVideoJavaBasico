/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.bryan.calculadoradetarifa;

import java.time.LocalTime;
import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class CalculadoraDeTarifa {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite a distancia (km): ");
        int km = ler.nextInt();
        
        ler.nextLine();
        
        LocalTime hora = LocalTime.now();
        System.out.println("Hora Atual: "+ hora);
        int h = hora.getHour();
        
        System.out.println("Esta chovendo? (Sim ou Nao)");
        String tempo = ler.nextLine();
        
        System.out.println("Tipo de carro: (Luxo ou Normal)");
        String carro = ler.nextLine();
        
        float preco = 0;
        if (carro.equalsIgnoreCase("Normal")){
            preco = (float) (km * 2.50);
        } else {
            if(carro.equalsIgnoreCase("Luxo")) {
                preco = (float) (km * 4);
            } else {
                System.out.println("Invalido");
            }
            
        }
        // acrescimo no horario de pico
        if ((h >= 6 && h <= 9) || (h >= 17 && h <= 20)){
            preco = (float) (preco * 1.20);
        }
        // acrescimo quando chove
        if (tempo.equalsIgnoreCase("Sim")){
            preco = preco * 1.10f;
        }
        // acrescimo carro de luxo apos 22h
        if (carro.equalsIgnoreCase("Luxo") && h > 22){
            preco = preco * 1.10f;
        }
        System.out.printf("Preco final da corrida: R$ %.2f", preco);
    }
}
