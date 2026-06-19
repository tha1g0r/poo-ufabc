package construtores.palavras;

public class Tabuleiro {
    private int nLinhas;
    private int nColunas;
    private char[][] conteudo;

    public Tabuleiro(char[][] matriz) {
        this.nLinhas = matriz.length;
        this.nColunas = matriz[0].length;

        this.conteudo = new char[nLinhas][nColunas];
        for (int i = 0; i < nLinhas; i++) {
            for (int j = 0; j < nColunas; j++) {
                this.conteudo[i][j] = matriz[i][j];
            }
        }
    }

    public Tabuleiro(int qtdLinhas, int qtdColunas, char[] dadosMatriz) {
        this.nLinhas = qtdLinhas;
        this.nColunas = qtdColunas;

        this.conteudo = new char[nLinhas][nColunas];
        int linhaAtual = 0;
        int colunaAtual = 0;
        for (int i = 0; i < dadosMatriz.length; i++) {
            if (this.conteudo[linhaAtual].length == this.nColunas) {
                linhaAtual++;
                colunaAtual = 0;
            }
            this.conteudo[linhaAtual][colunaAtual++] = dadosMatriz[i];
        }
    }
}