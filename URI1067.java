/* Leia um valor inteiro X (1 <= X <= 1000). 
Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.
*/

import java.util.Scanner;
public class URI1067{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);

        int x;

        x = teclado.nextInt();

        for(int n = 1; n <= x; n = n + 2){
            System.out.println(n);
        }
    }
}