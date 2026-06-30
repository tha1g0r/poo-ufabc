package aulainterfaces.machinelearning;

public class DadosTesteDesbalanceado extends DadosTeste {
    private String fonte;

    public DadosTesteDesbalanceado() {
        this("Nao informado");
    }

    public DadosTesteDesbalanceado(String fonte) {
        this.fonte = fonte;
    }

    public String getFonte() {
        return this.fonte;
    }

    public static boolean verificarFonte(DadosTesteDesbalanceado d) {
        return d.getFonte() == "ABC";
    }

    public double calcularAcuracia() {
        int numeroClasses = super.getClasses().length;
        int totalExemplos = super.getQtdExemplos();

        double somaFinal = 0.0;

        for (int i = 0; i < numeroClasses; i++) {
            String classeAtual = super.getClasses()[i];
            int totalClasse = 0;
            int qtdAcertos = 0;

            for (int j = 0; j < totalExemplos; j++) {
                Exemplo ex = super.getExemplo(j);

                if (ex.getClasseVerdadeira().equals(classeAtual)) {
                    totalClasse++;

                    if (ex.getClassePredita().equals(classeAtual)) qtdAcertos++;
                }
            }

            somaFinal += (double) qtdAcertos/totalClasse;
        }

        return somaFinal / numeroClasses;
    }
}
