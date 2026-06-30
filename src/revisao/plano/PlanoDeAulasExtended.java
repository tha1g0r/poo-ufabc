package revisao.plano;

public class PlanoDeAulasExtended extends PlanoDeAulas {
    public void removerAvalicoes() {
        int idxEscrita = 0;

        for (int i = 0; i < super.qtdAulas; i++) {
            if (!(super.aulas[i] instanceof Avaliacao)) {
                super.aulas[idxEscrita++] = super.aulas[i];
            }
        }

        for (int i = idxEscrita; i < super.qtdAulas; i++) {
            super.aulas[i] = null;
        }

        super.qtdAulas = idxEscrita;
    }

    public int comparar(PlanoDeAulasExtended p) {
        if (this.somaCargaHoraria() < p.somaCargaHoraria()) {
            return -1;
        } else if (this.somaCargaHoraria() > p.somaCargaHoraria()) {
            return 1;
        }

        return 0;
    }

    private int somaCargaHoraria() {
        int soma = 0;
        for (int i = 0; i < super.qtdAulas; i++) {
            soma += super.aulas[i].getCargaHoraria();
        }

        return soma;
    }

    public static int compararPlanos(PlanoDeAulasExtended p1, PlanoDeAulasExtended p2) {
        return p1.comparar(p2);
    }
}
