package src.introducaojava;

import java.util.Scanner;

public class CampoMinado {
    public static int[][] lerMatriz(Scanner leitor) {

        int linhas = leitor.nextInt();
        int colunas = leitor.nextInt();

        int[][] matriz = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = leitor.nextInt();
            }
        }

        return matriz;
    }

    public static int contarBombasVizinhas(int[][] matriz, int linha, int coluna) {
        int linhasTotais = matriz.length;
        int colunasTotais = matriz[0].length;

        int numero_bombas = 0;
        for (int dl = -1; dl <= 1; dl++) {
            for (int dc = -1; dc <= 1; dc++) {
                if (dl == 0 && dc == 0) {
                    continue;
                }

                int novaLinha = linha + dl;
                int novaColuna = coluna + dc;

                if (novaLinha >= 0 && novaLinha < linhasTotais && novaColuna >= 0 && novaColuna < colunasTotais) {
                    if (matriz[novaLinha][novaColuna] == 1) {
                        numero_bombas++;
                    }
                }
            }
        }

        return numero_bombas;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[][] matriz = lerMatriz(leitor);

        int linha = leitor.nextInt();
        int coluna = leitor.nextInt();

        int n_bombas_vizinhas = contarBombasVizinhas(matriz, linha, coluna);

        System.out.println(n_bombas_vizinhas);

        leitor.close();
    }
}
