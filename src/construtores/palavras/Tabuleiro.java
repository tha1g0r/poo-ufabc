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
            if (colunaAtual == this.nColunas) {
                linhaAtual++;
                colunaAtual = 0;
            }
            this.conteudo[linhaAtual][colunaAtual++] = dadosMatriz[i];
        }
    }

    private static String inverterString(String palavra) {
        String inversa = "";
        for (int i = palavra.length() - 1; i >= 0; i--) {
            inversa += palavra.charAt(i);
        }

        return inversa;
    }

    private PalavraEncontrada buscaHorizontal(String palavra, String palavraInversa, int tamanhoPalavra, char primeiroCaractere, char ultimoCaractere) {
        for (int linha = 0; linha < this.nLinhas; linha++) {
            for (int coluna = 0; coluna <= this.nColunas - tamanhoPalavra; coluna++) {
                char caractereAtual = this.conteudo[linha][coluna];

                if (caractereAtual == primeiroCaractere || caractereAtual == ultimoCaractere) {
                    String palavraAtual = "";
                    
                    for (int i = coluna; i < coluna + tamanhoPalavra; i++) {
                        palavraAtual += this.conteudo[linha][i];
                    }

                    if (palavraAtual.equals(palavra)) {
                        return new PalavraEncontrada(palavra, new int[]{linha, coluna}, "l1"); 
                    } else if (palavraAtual.equals(palavraInversa)) {
                        return new PalavraEncontrada(palavra, new int[]{linha, coluna}, "l2");
                    }
                }
            }
        }
        
        return null;
    }

    private PalavraEncontrada buscaVertical(String palavra, String palavraInversa, int tamanhoPalavra, char primeiroCaractere, char ultimoCaractere) {
        for (int linha = 0; linha <= this.nLinhas - tamanhoPalavra; linha++) {
            for (int coluna = 0; coluna < this.nColunas; coluna++) {
                char caractereAtual = this.conteudo[linha][coluna];

                if (caractereAtual == primeiroCaractere || caractereAtual == ultimoCaractere) {
                    String palavraAtual = "";
                    
                    for (int i = linha; i < linha + tamanhoPalavra; i++) {
                        palavraAtual += this.conteudo[i][coluna];
                    }

                    if (palavraAtual.equals(palavra)) {
                        return new PalavraEncontrada(palavra, new int[]{linha, coluna}, "c1"); 
                    } else if (palavraAtual.equals(palavraInversa)) {
                        return new PalavraEncontrada(palavra, new int[]{linha, coluna}, "c2");
                    }
                }
            }
        }
        
        return null;
    }

    private PalavraEncontrada buscaDiagonal(String palavra, String palavraInversa, int tamanhoPalavra, char primeiroCaractere, char ultimoCaractere) {
        // Diagonal Principal (L -> R)
        for (int linha = 0; linha <= this.nLinhas - tamanhoPalavra; linha++) {
            for (int coluna = 0; coluna <= this.nColunas - tamanhoPalavra; coluna++) {
                char caractereAtual = this.conteudo[linha][coluna];

                if (caractereAtual == primeiroCaractere || caractereAtual == ultimoCaractere) {
                    String palavraAtual = "";
                    
                    for (int i = 0; i < tamanhoPalavra; i++) {
                        palavraAtual += this.conteudo[linha + i][coluna + i];
                    }

                    if (palavraAtual.equals(palavra)) {
                        return new PalavraEncontrada(palavra, new int[]{linha, coluna}, "d2"); 
                    } else if (palavraAtual.equals(palavraInversa)) {
                        return new PalavraEncontrada(palavra, new int[]{linha, coluna}, "d4");
                    }
                }
            }
        }

        // Diagonal Secunsária (L <- R)
        for (int linha = 0; linha <= this.nLinhas - tamanhoPalavra; linha++) {
            for (int coluna = tamanhoPalavra - 1; coluna < this.nColunas; coluna++) {
                char caractereAtual = this.conteudo[linha][coluna];

                if (caractereAtual == primeiroCaractere || caractereAtual == ultimoCaractere) {
                    String palavraAtual = "";
                    
                    for (int i = 0; i < tamanhoPalavra; i++) {
                        palavraAtual += this.conteudo[linha + i][coluna - i];
                    }

                    if (palavraAtual.equals(palavra)) {
                        return new PalavraEncontrada(palavra, new int[]{linha, coluna}, "d3"); 
                    } else if (palavraAtual.equals(palavraInversa)) {
                        return new PalavraEncontrada(palavra, new int[]{linha, coluna}, "d1");
                    }
                }
            }
        }
        
        return null;
    }

    public PalavraEncontrada buscar(String palavra) {
        int tamanhoPalavra = palavra.length();
        char primeiroCaractere = palavra.charAt(0);
        char ultimoCaractere = palavra.charAt(tamanhoPalavra - 1);
        String palavraInversa = inverterString(palavra);

        PalavraEncontrada encontrada;

        encontrada = this.buscaHorizontal(palavra, palavraInversa, tamanhoPalavra, primeiroCaractere, ultimoCaractere);
        if (encontrada != null) return encontrada;

        encontrada = this.buscaVertical(palavra, palavraInversa, tamanhoPalavra, primeiroCaractere, ultimoCaractere);
        if (encontrada != null) return encontrada;

        encontrada = this.buscaDiagonal(palavra, palavraInversa, tamanhoPalavra, primeiroCaractere, ultimoCaractere);
        if (encontrada != null) return encontrada;

        return null;
    }

    private static PalavraEncontrada[] removerNulos(PalavraEncontrada[] v, int qtdeNulos) {
        PalavraEncontrada[] vetorSemNulos = new PalavraEncontrada[v.length - qtdeNulos];
        int controle = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] != null) {
                vetorSemNulos[controle++] = v[i];
            }
        }

        return vetorSemNulos;
    }

    public PalavraEncontrada[] buscar(String[] palavras) {
        PalavraEncontrada[] vetorComNulos = new PalavraEncontrada[palavras.length];
        int qtdeNulos = 0;

        for (int i = 0; i < palavras.length; i++) {
            vetorComNulos[i] = this.buscar(palavras[i]);

            if (vetorComNulos[i] == null) qtdeNulos++;
        }

        return removerNulos(vetorComNulos, qtdeNulos);
    }

    @Override
    public String toString() {
        // StringBuilder ajuda a concatenar textos de forma muito mais rápida que usar String comum (+)
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < nLinhas; i++) {
            for (int j = 0; j < nColunas; j++) {
                // Adiciona o caractere atual e um espaço para não ficar tudo grudado
                sb.append(conteudo[i][j]).append(" ");
            }
            // Ao terminar uma linha da matriz, pula para a próxima linha do texto
            sb.append("\n");
        }

        // Retorna o texto formatado final
        return sb.toString();
    }
}
