// Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. 
// Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.

import java.util.Scanner;
public class URI1051{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);

        double salario, imposto;

        salario = teclado.nextDouble();

        if(salario <= 2000.00){
            System.out.println("Isento");
        }
        else if(salario > 2000.00 && salario <= 3000.00){
            imposto = (salario - 2000.00) * 0.08;
            System.out.printf("R$ %.2f\n", imposto);
        }
        else if(salario > 3000.00 && salario <= 4500.00){
            imposto = (salario - 3000.00) * 0.18 + 1000 * 0.08;
            System.out.printf("R$ %.2f\n", imposto);
        }
        else if(salario > 4500.00){
            imposto = (salario - 4500.00) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
            System.out.printf("R$ %.2f\n", imposto);
        }
    }
}