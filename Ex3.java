// Sabendo que o valor de 100 kw corresponde a 1/7 do valor do salário mínimo, faça um programa
// java que receba o valor do salário mínimo e a quantidade de kw gasta por uma residência e calcule:
// a. O valor em reais de cada KW
// b. O valor em reais a ser pago
// c. O novo valor a ser pago por essa residência com um desconto de 10%

import java.util.Scanner;
public class Ex3{
    public static void main (String args[]){
        Scanner teclado;
        teclado = new Scanner (System.in);

        // entrada

        float ValorSalario;
        float kwgasto;
        float ValorKW;
        float ValorPago;
        float ValorDesconto;

        System.out.println("Digite o valor do salario minimo atual (R$): ");
        ValorSalario = teclado.nextFloat();
        System.out.println("Digite a quantidade de energia gasta em sua residencia (KW): ");
        kwgasto = teclado.nextFloat();
        
        // processamento

        ValorKW = ValorSalario / 700;
        ValorPago = ValorKW * kwgasto;
        ValorDesconto = ValorPago * 90 / 100;

        // saida

        System.out.printf("a. O valor em reais de cada KW e: %.2f\n", ValorKW);
        System.out.printf("b. Valor a ser pago: %.2f\n", ValorPago);
        System.out.printf("c. Valor com desconto: %.2f\n", ValorDesconto);
        
    }
}