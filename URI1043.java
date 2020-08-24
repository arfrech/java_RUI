// Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. 
// Em caso positivo, calcule o perímetro do triângulo e apresente a mensagem:
// Perimetro = XX.X
// Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem:
// Area = XX.X

import java.util.Scanner;
public class URI1043{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);

        double A, B, C, perimetro, area;

        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

        if(A + B > C && A + C > B && B + C > A){
            perimetro = A + B + C;
            System.out.printf("Perimetro = %.1f\n", perimetro);
        }
        else{
            area = (A + B) * C / 2;
            System.out.printf("Area = %.1f\n", area);
        }
    }
}