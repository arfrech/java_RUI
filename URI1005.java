// Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2 notas de um aluno. 
// A seguir, calcule a média do aluno, sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5 
// (A soma dos pesos portanto é 11). Assuma que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.

import java.util.Scanner;
public class URI1005{
    public static void main (String args[]){
    Scanner teclado = new Scanner (System.in);

    double nota1, nota2, MEDIA;

    nota1 = teclado.nextDouble();
    nota2 = teclado.nextDouble();

    MEDIA = ((nota1 * 3.5) + (nota2 * 7.5)) / 11;

    System.out.printf("MEDIA = %.5f\n", MEDIA);

    }
}