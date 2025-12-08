/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.bryan.comparacaostring;

/**
 *
 * @author bryan
 */
public class ComparacaoString {

    public static void main(String[] args) {
        String nome1 = "Bryan";
        String nome2 = "Bryan";
        String nome3 = new String ("Bryan");
        String res;
        res = (nome1.equals(nome3))?"igual":"diferente";
        System.out.println(res);
    }
}
