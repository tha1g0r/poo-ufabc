package construtores.palavras;

public class PalavraEncontrada {
    private String palavra;
    private int[] posicao = new int[2];
    private int tipo;
    private int direcao;

    public PalavraEncontrada(String palavra, int[] posicao, String codigoDirecao) {
        this.palavra = palavra;
        this.posicao[0] = posicao[0];
        this.posicao[1] = posicao[1];
        
        switch (codigoDirecao) {
            case "l1": this.tipo = 1; this.direcao = 1; break;
            case "l2": this.tipo = 1; this.direcao = 2; break;
            case "c1": this.tipo = 2; this.direcao = 1; break;
            case "c2": this.tipo = 2; this.direcao = 2; break;
            case "d1": this.tipo = 3; this.direcao = 1; break;
            case "d2": this.tipo = 3; this.direcao = 2; break;
            case "d3": this.tipo = 3; this.direcao = 3; break;
            case "d4": this.tipo = 3; this.direcao = 4; break;
        }
    }

    public String getPalavra() {
        return this.palavra;
    }

    public int[] getPosicao() {
        return this.posicao;
    }

    public int getTipo() {
        return this.tipo;
    }

    public int getDirecao() {
        return this.direcao;
    }

    @Override
    public String toString() {
    return "PalavraEncontrada{" +
            "palavra='" + this.palavra + '\'' +
            ", posicao=(" + this.posicao[0] + ", " + this.posicao[1] + ")" +
            ", tipo=" + this.tipo +
            ", direcao=" + this.direcao +
            '}';
    }
}
