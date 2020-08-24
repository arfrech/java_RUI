public class TesteVariaveis{
    public static void main(String args[]){
        //int a;
        //int b;
        //int c;

        int a,b,c;

        a = 10;
        b = 8;

        c = a + b;

        System.out.println("Valor do a = " + a); // faço uma concatenação
        System.out.println("Valor do b = " + b);
        System.out.println("Valor do c = " + c);

        c = a / b;
        System.out.println("Valor do c novamente = " + c);

        c = a % b;
        System.out.println("Valor do resto do c = " + c);

        double x, y, z;

        x = 10.0;
        y = 8.0;
        z = x / y;

       // System.out.println("Valor do x = " + x);
        //System.out.println("Valor do y = " + y);
        //System.out.println("Valor do z = " + z);

        // saída mais "bonitinha" - determinando quantas casas decimais

        // printf - print formatted
        // %f - para float/double
        // %d - para inteiros
        System.out.printf("Valor do x = %.2f\n", x);
        System.out.printf("Valor do y = %.2f\n", y);
        System.out.printf("Valor do z = %.2f\n", z);

    }
}