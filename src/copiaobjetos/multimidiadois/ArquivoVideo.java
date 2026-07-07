package copiaobjetos.multimidiadois;

public class ArquivoVideo extends ArquivoMultimidia {
    private int[] dimensao = new int[2];

    public ArquivoVideo(String nomeArquivo, int largura, int altura) {
        super(nomeArquivo);

        this.dimensao[0] = largura;
        this.dimensao[1] = altura;
    }

    @Override
    public String toString() {
        // "Video: %s (%d x %d)"

        return String.format("Video: %s (%d x %d)", super.getNomeArquivo(), this.dimensao[0], this.dimensao[1]);
    }
}
