/* Leia um valor inteiro N. Apresente o quadrado de cada um dos valores pares, de 1 até N, 
inclusive N, se for o caso.
*/

import java.util.Scanner;
public class URI1073{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);

        int n = teclado.nextInt();
        int p;

        for(int c = 2; c <= n; c = c +2){
            p = c * c;
            System.out.println(c + "^2 = " + p);
        }
    }
}