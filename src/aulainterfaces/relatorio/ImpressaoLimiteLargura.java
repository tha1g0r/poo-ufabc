package aulainterfaces.relatorio;

public class ImpressaoLimiteLargura implements PluginImpressao {
    private int larguraMax;

    public ImpressaoLimiteLargura(int largura) {
        this.larguraMax = largura;
    }

    public void imprimir(Relatorio r) {
        String textoCompleto = r.getTexto();
 
        String[] tokens = new String[textoCompleto.length()];
        int totalTokens = 0;
        int i = 0;
 
        while (i < textoCompleto.length()) {
            char c = textoCompleto.charAt(i);
            if (c == ' ') {
                tokens[totalTokens++] = " ";
                i++;
            } else {
                int inicio = i;
                while (i < textoCompleto.length() && textoCompleto.charAt(i) != ' ') {
                    i++;
                }
                tokens[totalTokens++] = textoCompleto.substring(inicio, i);
            }
        }
 
        String[] linhas = new String[totalTokens + 1];
        int totalLinhas = 0;
        String linhaAtual = "";
 
        int t = 0;
        while (t < totalTokens) {
            String token = tokens[t];
 
            if (token.equals(" ")) {
                t++;
                continue;
            }

            String palavra = token;
 
            if (linhaAtual.length() == 0) {
                if (palavra.length() > larguraMax) {
                    linhas[totalLinhas++] = palavra;
                } else {
                    linhaAtual = palavra;
                }
                t++;
            } else {
                int tamanhoComPalavra = linhaAtual.length() + 1 + palavra.length();
 
                if (tamanhoComPalavra <= larguraMax) {
                    linhaAtual = linhaAtual + " " + palavra;
                    t++;
                } else {
                    linhas[totalLinhas++] = linhaAtual;
                    linhaAtual = "";
                }
            }
        }

        if (linhaAtual.length() > 0) {
            linhas[totalLinhas++] = linhaAtual;
        }

        int j = 1;
        while (j < totalLinhas) {
            String linha = linhas[j];
            if (linha.length() > 0 && ehPontuacao(linha.charAt(0))) {
                String anterior = linhas[j - 1];

                int k = anterior.length() - 1;
                while (k > 0 && anterior.charAt(k) != ' ') {
                    k--;
                }
 
                String ultimaPalavra;
                String restoAnterior;
 
                if (anterior.charAt(k) == ' ') {
                    ultimaPalavra = anterior.substring(k + 1);
                    restoAnterior = anterior.substring(0, k);
                } else {
                    ultimaPalavra = anterior;
                    restoAnterior = "";
                }
 
                linhas[j - 1] = restoAnterior;
                linhas[j] = ultimaPalavra + linha;
            }
            j++;
        }

        for (int l = 0; l < totalLinhas; l++) {
            if (linhas[l].length() > 0) {
                System.out.println(linhas[l]);
            }
        }
    }
 
    private boolean ehPontuacao(char c) {
        return c == '.' || c == ',' || c == ';' || c == ':' || c == '!'
            || c == '?' || c == ')' || c == ']' || c == '}' || c == '"'
            || c == '-';
    }
}
