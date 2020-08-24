// Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. 
// Em seguida, calcule e mostre:
// a) a área do triângulo retângulo que tem A por base e C por altura.
// b) a área do círculo de raio C. (pi = 3.14159)
// c) a área do trapézio que tem A e B por bases e C por altura.
// d) a área do quadrado que tem lado B.
// e) a área do retângulo que tem lados A e B.

import java.util.Scanner;
public class URI1012{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);

        double A, B, C, TRIANGULO, CIRCULO, TRAPEZIO, QUADRADO, RETANGULO;

        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

        TRIANGULO = A * C / 2;

        CIRCULO = 3.14159 * C * C;

        TRAPEZIO = ((A + B) * C) / 2;

        QUADRADO = B * B;

        RETANGULO = A * B;

        System.out.printf("TRIANGULO: %.3f\n", TRIANGULO);
        System.out.printf("CIRCULO: %.3f\n", CIRCULO);
        System.out.printf("TRAPEZIO: %.3f\n", TRAPEZIO);
        System.out.printf("QUADRADO: %.3f\n", QUADRADO);
        System.out.printf("RETANGULO: %.3f\n", RETANGULO);

    }
}
