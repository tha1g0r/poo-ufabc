package copiaobjetos.multimidiadois;

public class Programa {
    private static void imprimirVetor(String[] v) {
    if (v == null) {
        System.out.println("Vetor nulo");
        return;
    }

    int n = v.length;

    if (n == 0) {
        System.out.println();
        return;
    }

    for (int i = 0; i < n - 1; i++) {
        System.out.print(v[i] + ", ");
    }

    System.out.println(v[n - 1]);
}

    public static void main(String[] args) {
        Playlist ensaio = new Playlist();

        ArquivoMultimidia m1 = new ArquivoAudio("venha-o-teu-reino", true);
        ArquivoMultimidia m2 = new ArquivoAudio("tua-graca-me-basta", true);
        ArquivoMultimidia m3 = new ArquivoAudio("te-louvarei", true);
        ArquivoMultimidia m4 = new ArquivoAudio("lembra-senhor", true);
        ArquivoMultimidia m5 = new ArquivoAudio("olha-pra-mim", true);
        ArquivoMultimidia m6 = new ArquivoAudio("sobre-as-aguas", true);
        ArquivoMultimidia m7 = new ArquivoAudio("restitui", true);
        ArquivoMultimidia m8 = new ArquivoAudio("deus-de-promessas", true);
        ensaio.adicionarItem(m1);
        ensaio.adicionarItem(m2);
        ensaio.adicionarItem(m3);
        ensaio.adicionarItem(m4);
        ensaio.adicionarItem(m5);
        ensaio.adicionarItem(m6);
        ensaio.adicionarItem(m7);
        ensaio.adicionarItem(m8);
        imprimirVetor(ensaio.listarArquivos());

        ArquivoMultimidia m9 = new ArquivoAudio("leva-alem", true);
        ensaio.adicionarItem(m9);
        imprimirVetor(ensaio.listarArquivos());
        ensaio.renomearItem(8, "leva-me-alem");
        imprimirVetor(ensaio.listarArquivos());

        ensaio.moverParaInicio(6);
        imprimirVetor(ensaio.listarArquivos());
    }
}
