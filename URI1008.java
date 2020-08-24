// Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. 
// A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

import java.util.Scanner;
public class URI1008{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);

        int NUMBER, HORAS;
        float SALARIOHORA, SALARY;

        NUMBER = teclado.nextInt();
        HORAS = teclado.nextInt();
        SALARIOHORA = teclado.nextFloat();

        SALARY = HORAS * SALARIOHORA;

        System.out.println("NUMBER = " + NUMBER);
        System.out.printf("SALARY = U$ %.2f\n", SALARY);
        
    }
}