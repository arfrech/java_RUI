// Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. 
// A seguir calcule a duração do jogo.

import java.util.Scanner;
public class URI1047{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);

        int h1, m1, h2, m2, h1total, h2total, htotal, mtotal;

        h1 = teclado.nextInt();
        m1 = teclado.nextInt();
        h2 = teclado.nextInt();
        m2 = teclado.nextInt();

        h1total = h1 * 60 + m1;
        h2total = h2 * 60 + m2;

        if(h1total < h2total){
            htotal = (h2total - h1total) / 60;
            mtotal = (h2total - h1total) % 60;
            System.out.println("O JOGO DUROU " + htotal + " HORA(S) E " + mtotal + " MINUTO(S)");
        }
        else if(h1total == h2total){
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        }
        else if(h1total > h2total){
            htotal = ((24*60 - h1total) + h2total) / 60;
            mtotal = ((24*60 - h1total) + h2total) % 60;
            System.out.println("O JOGO DUROU " + htotal + " HORA(S) E " + mtotal + " MINUTO(S)");
        }
    }
}