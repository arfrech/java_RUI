/* Leia um valor inteiro X. 
Em seguida apresente os 6 valores ímpares consecutivos a partir de X, um valor por linha, 
inclusive o X ser for o caso.
*/

import java.util.Scanner;
public class URI1070{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);

        int x = teclado.nextInt();
        
        if (x % 2 == 0){
            x++;
        }
        
        for(int cont = 1; cont < 7; cont++){
            System.out.println(x);
            x = x + 2;
            }
        }
    }