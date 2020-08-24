// Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. 
// A seguir, calcule e mostre o valor da conta a pagar.

import java.util.Scanner;
public class URI1038{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);

        int codigo, quantidade;
        double valor, pgto;
        
        codigo = teclado.nextInt();
        quantidade = teclado.nextInt();

        if(codigo == 1){
            valor = 4.00;
        }
        else if(codigo == 2){
            valor = 4.50;
        }
        else if(codigo == 3){
            valor = 5.00;
        }
        else if(codigo == 4){
            valor = 2.00;
        }
        else{
            valor = 1.50;
        }
        pgto = valor * quantidade;

        System.out.printf("Total: R$ %.2f\n", pgto);
    }
}