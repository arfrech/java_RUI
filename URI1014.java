// Calcule o consumo médio de um automóvel sendo 
// fornecidos a distância total percorrida (em Km) e o total de combustível gasto (em litros).

import java.util.Scanner;
public class URI1014{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);

        int X;
        double Y;
        double media;
        
        X = teclado.nextInt();
        Y = teclado.nextDouble();

        media = X / Y;

        System.out.printf("%.3f km/l\n", media);

    }
}