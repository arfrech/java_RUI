/* Faça um programa que leia 5 valores inteiros. 
Conte quantos destes valores digitados são pares e mostre esta informação.
*/

import java.util.Scanner;
public class URI1065{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);

        int n;
        int pares = 0;
       
        for(int cont = 1; cont < 6; cont++){
            n = teclado.nextInt();
            if (n % 2 == 0){
            pares++;
            }
        }
        System.out.println(pares+" valores pares");
    }
}