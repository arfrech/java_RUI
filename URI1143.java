/* Escreva um programa que leia um valor inteiro N (1 < N < 1000). 
Este N é a quantidade de linhas de saída que serão apresentadas na execução do programa.
*/

import java.util.Scanner;
public class URI1143{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);

        int n = teclado.nextInt();
        int c1 = 2;
        int c2 = 4;
        int c3 = 8;

        System.out.println("1 1 1");

        for(int cont = 2; cont <= n; cont++){
            System.out.println(c1 + " " + c2 + " " + c3);
            c1++;
            c2 = c1 * c1;
            c3 = c1 * c2;
        }  
    }
}