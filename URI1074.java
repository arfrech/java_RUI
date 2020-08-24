/* Leia um valor inteiro N. 
Este valor será a quantidade de valores que serão lidos em seguida. 
Para cada valor lido, mostre uma mensagem em inglês dizendo se este valor lido é 
par (EVEN), ímpar (ODD), positivo (POSITIVE) ou negativo (NEGATIVE). 
No caso do valor ser igual a zero (0), embora a descrição correta seja (EVEN NULL), 
pois por definição zero é par, seu programa deverá imprimir apenas NULL.
*/

import java.util.Scanner;
public class URI1074{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);

        int n = teclado.nextInt();
        int cont = 1;

        while(cont <= n){

            int x = teclado.nextInt();

            if(x == 0){
                System.out.println("NULL");
            }
            else if(x % 2 == 0 && x > 0){
                System.out.println("EVEN POSITIVE");
            }
            else if(x % 2 == 0 && x < 0){
                System.out.println("EVEN NEGATIVE");
            }
            else if(x % 2 != 0 && x > 0){
                System.out.println("ODD POSITIVE");
            }
            else{
                System.out.println("ODD NEGATIVE");
            }
            cont++;
        }
    }
}