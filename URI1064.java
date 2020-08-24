/* Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos. 
Na próxima linha, deve-se mostrar a média de todos os valores positivos digitados, 
com um dígito após o ponto decimal.
*/

import java.util.Scanner;
public class URI1064{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);

        double n, media;
        int positivo = 0;
        double soma = 0;

        for(int cont = 1; cont <= 6; cont++){
            n = teclado.nextDouble();
            if(n > 0){
                positivo++;
                soma = soma + n;
            }
        }
        media = soma / positivo;

        System.out.println(positivo + " valores positivos");
        System.out.printf("%.1f\n", media);
    }
}