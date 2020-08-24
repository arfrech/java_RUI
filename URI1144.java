/* Escreva um programa que leia um valor inteiro N. 
N * 2 linhas de saída serão apresentadas na execução do programa, seguindo a lógica do exemplo abaixo. 
Para valores com mais de 6 dígitos, todos os dígitos devem ser apresentados.
*/

import java.util.Scanner;
public class URI1144{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);

        int n = teclado.nextInt();
        int c1 = 2;
        int c2 = 4;
        int c3 = 8;

        System.out.println("1 1 1");
        System.out.println("1 2 2");

        for(int cont = 2; cont <= n; cont++){

            System.out.println(c1 + " " + c2 + " " + c3);
            c2++;
            c3++;
            System.out.println(c1 + " " + c2 + " " + c3);
            c1++;
            c2 = c1 * c1;
            c3 = c1 * c2;
        }
    }
}