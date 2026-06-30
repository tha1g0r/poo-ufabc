package aulainterfaces.machinelearning;

public class DadosTestePadrao extends DadosTeste {
    public double calcularAcuracia() {
        int totalExemplos = super.getQtdExemplos();
        int qtdAcertos = 0;

        for (int i = 0; i < totalExemplos; i++) {
            Exemplo ex = super.getExemplo(i);

            if (ex.getClassePredita().equals(ex.getClasseVerdadeira())) qtdAcertos++;
        }

        return (double) qtdAcertos/totalExemplos;
    }
}
