package introducaojava;

import java.util.Scanner;

public class TestesDiscosVoadores {
    public static void imprimirVetor(int[] vetor) {
        int n = vetor.length;

        for (int i = 0; i < n-1; i++) {
            System.out.printf("%d ", vetor[i]);
        }
        System.out.println(vetor[n-1]);
    }

    public static void imprimirMatriz(int[][] matriz) {
        int n_linhas = matriz.length;

        for (int i = 0; i < n_linhas; i++) {
            imprimirVetor(matriz[i]);
        }
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // ler e imprimir matriz original
        int n_linhas = leitor.nextInt();
        int n_colunas = leitor.nextInt();
        int[][] matriz = new int[n_linhas][n_colunas];
        for (int i = 0; i < n_linhas; i++) {
            for (int j = 0; j < n_colunas; j++) {
                matriz[i][j] = leitor.nextInt();
            }
        }

        System.out.println();
        System.out.println("Matriz Original:");
        imprimirMatriz(matriz);

        // ordenar por linhas;
        //ordenarLinhas(matriz, 0);

        leitor.close();
    }
}
