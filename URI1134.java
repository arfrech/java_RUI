

import java.util.Scanner;
public class URI1134{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);

        int n = teclado.nextInt();
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        
        while(n != 4){
            if(n == 1){
                alcool = alcool + 1;
            }
            else if(n == 2){
                gasolina = gasolina + 1;
            }
            else if(n == 3){
                diesel = diesel + 1;
            }

            /*
            switch(n){
                case 1:
                alcool = alcool + 1;
                break;
                case 2:
                gasolina = gasolina + 1;
                break;
                case 3:
                diesel = diesel + 1;
                break;
            }
            */
            n = teclado.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }
}