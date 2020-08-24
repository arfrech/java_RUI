/* Escreva um programa que repita a leitura de uma senha até que ela seja válida. 
Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida". 
Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" 
e o algoritmo encerrado. Considere que a senha correta é o valor 2002. 
*/

import java.util.Scanner;
public class URI1114{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);

        int tentativa = teclado.nextInt();
        int senha = 2002;

        while(tentativa != senha){
            System.out.println("Senha Invalida");
            tentativa = teclado.nextInt();
        }

        System.out.println("Acesso Permitido");
    }
}