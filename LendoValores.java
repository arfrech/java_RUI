import java.util.Scanner;
public class LendoValores{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int a;
        float b;
        double c;

        System.out.println("Digite um valor inteiro: ");
        a = teclado.nextInt();
        System.out.println("Digite um valor real (FLOAT): ");
        b = teclado.nextFloat();
        System.out.println("Digite um valor real (DOUBLE): ");
        c = teclado.nextDouble();

        System.out.println("Você digitou: " + a + " - " + b + " - " + c);
    }
}