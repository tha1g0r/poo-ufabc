package introducaojava;

import java.util.Scanner;

public class SelectionSort {
    public static int ordenar(int[] v) {
        // Este método deve ordenar o vetor v em ordem crescente usando o algoritmo selection sort
        // O retorno do método é o número de trocas entre elementos realizadas no vetor
        
        int trocas = 0;
        
        for (int i = 0; i < v.length - 1; i++) {
            int idxMenor = i;
            
            for (int j = i + 1; j < v.length; j++) {
                if (v[j] < v[idxMenor]) {
                    idxMenor = j;
                }
            }
            
            if (i != idxMenor) {
                int temp = v[i];
                v[i] = v[idxMenor];
                v[idxMenor] = temp;
                
                trocas++;
            }
        }
        
        return trocas;
    }
    
    public static void imprimirVetor(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int n = leitor.nextInt();
        int[] vetor = new int[n];
        for (int i = 0; i < n; i++) {
            vetor[i] = leitor.nextInt();
        }

        imprimirVetor(vetor);
        
        int trocas = ordenar(vetor);
        imprimirVetor(vetor);
        
        System.out.println("Trocas: " + trocas);

        leitor.close();
    }
}
