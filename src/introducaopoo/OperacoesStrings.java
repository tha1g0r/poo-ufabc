package introducaopoo;

public class OperacoesStrings {
    private String texto;
    private String[] listaPalavras;

    private void dividirTexto() {
        int qtdPalavras = this.contaPalavras();
        String[] listaPalavras = new String[qtdPalavras];

        int palavrasAdicionadas = 0;

        String palavra = "";
        for (int i = 0; i < this.texto.length(); i++) {
            char caractereAtual = this.texto.charAt(i);
            if((caractereAtual != ' ') && (caractereAtual != '.')) {
                palavra += caractereAtual;
                continue;
            }

            if (palavra != "") {
                listaPalavras[palavrasAdicionadas++] = palavra;
                palavra = "";
            }
        }
        if (!palavra.equals("")) listaPalavras[palavrasAdicionadas++] = palavra;

        this.listaPalavras = listaPalavras;
    }

    void setTexto(String texto) {
        this.texto = texto;
        this.dividirTexto();
    }

    String getTexto() {
        return this.texto;
    }

    int contaPalavras() {
        int contador = 0;
        boolean emPalavra = false;

        for (int i = 0; i < this.texto.length(); i++) {
            char c = this.texto.charAt(i);
            if (c != ' ' && c != '.') {
                if (!emPalavra) {
                    contador++;
                    emPalavra = true;
                }
            } else {
                emPalavra = false;
            }
        }

        return contador;
    }

    double comprimentoMedioPalavras() {
        int somaComprimentos = 0;
        int qtdPalavras = this.contaPalavras();

        for (int i = 0; i < qtdPalavras; i++) {
            somaComprimentos += listaPalavras[i].length();
        }

        return (double) somaComprimentos/qtdPalavras;
    }

    String maiorPalavra() {
        int idxMaior = 0;

        for (int i = 1; i < this.contaPalavras(); i++) {
            if (listaPalavras[i].length() > listaPalavras[idxMaior].length()) {
                idxMaior = i;
            }
        }

        return listaPalavras[idxMaior];
    }

    int comprimentoMaiorPalavra() {
        String maiorPalavra = this.maiorPalavra();

        return maiorPalavra.length();
    }
}
