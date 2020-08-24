// Leia a hora inicial e a hora final de um jogo. 
// A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, 
// tendo uma duração mínima de 1 hora e máxima de 24 horas.

import java.util.Scanner;
public class URI1046{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);

        int h1, h2, total;

        h1 = teclado.nextInt();
        h2 = teclado.nextInt();

        if(h1 < h2){
            total = h2 - h1;
            System.out.println("O JOGO DUROU " + total + " HORA(S)");
        }
        else{
            total = (24 - h1) + h2;
            System.out.println("O JOGO DUROU " + total + " HORA(S)");
        }
    }
}