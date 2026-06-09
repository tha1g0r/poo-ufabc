package src.introducaojava;

import java.util.Scanner;

public class SerieGregory {
    
    public static void imprimirTermos(int n) {
        int denominador = 1;
        double pi = 0.0;

        for (int i = 1; i <= n; i++) {
            double termo = 4.0/denominador;

            if (i%2 == 0) {
                termo = -termo;
            }

            pi += termo;

            if (i <= 50) {
                if (i == n || i == 50) {
                    System.out.print(String.format("%.5f", termo));
                } else {
                    System.out.print(String.format("%.5f ", termo));
                }
            }

            denominador += 2;
        }

        System.out.println(); 
        System.out.println(String.format("%.5f", pi));
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int n = leitor.nextInt();
        
        imprimirTermos(n);

        leitor.close();
    }
}
