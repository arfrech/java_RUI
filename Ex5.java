// Calcular a quantidade de litros de combustível gastos em uma viagem, sabendo-se
// que um carro faz, em média, 12 km/l. Deverão ser fornecidos o tempo gasto da viagem
// e a velocidade média:
// distancia = velocidade x tempo
// litros utilizado = distancia / 12

import java.util.Scanner;
public class Ex5{
    public static void main (String args[]){
        Scanner teclado;
        teclado = new Scanner (System.in);

        // double t;
        // double v;
        // double d;
        // double l;

        float t, v, l;
                
        System.out.println("Tempo gasto (em horas) = ");
        // t = teclado.nextDouble();
        t = teclado.nextFloat();
        System.out.println("Velocidade media (KM/H): ");
        // v = teclado.nextDouble();
        v = teclado.nextFloat();
        
       //  d = v * t;
       //  l = d / 12;

       l = v * t / 12;
       
     //  System.out.printf("Quantidade combustivel: %.2f\n", l);

        System.out.println("Quantidade de conbustivel: " + l + " litro(s)");


        }
    }