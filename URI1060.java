/* Faça um programa que leia 6 valores. 
Estes valores serão somente negativos ou positivos (desconsidere os valores nulos). 
A seguir, mostre a quantidade de valores positivos digitados.
*/

import java.util.Scanner;
public class URI1060{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);

            int positivos = 0;

        for(int cont = 1; cont < 7; cont++){
            float n = teclado.nextFloat();
            if(n>1){
                positivos++;
            }
        }
        System.out.println(positivos+" valores positivos");
    }
}