/* Escreva um programa que leia um valor inteiro N. 
Este N é a quantidade de linhas de saída que serão apresentadas na execução do programa.
*/

import java.util.Scanner;
public class URI1142{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);

        int n = teclado.nextInt();
        int c1 = 1;
        int c2 = 2;
        int c3 = 3;

        for (int cont = 1; cont <= n; cont++){

            System.out.println(c1 + " " + c2 + " " + c3 + " PUM");

            c1 = c3 + 2;
            c2 = c1 + 1;
            c3 = c1 + 2;
        }
    }
}