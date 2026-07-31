package tratamentoexcecoes.dispositivos;

class LampadaEstaLigada extends Exception {
    public LampadaEstaLigada() {
        super("A lampada ja esta ligada.");
    }
}

class LampadaEstaDesligada extends Exception {
    public LampadaEstaDesligada() {
        super("A lampada ja esta desligada.");
    }
}

public class GerenciadorLampadas {
    private LampadaInteligente[] vetor = new LampadaInteligente[10];
    private int n = 0;

    public void adicionarLampada() {
        LampadaInteligente novaLampada = new LampadaInteligente();
        this.vetor[n++] = novaLampada;
    }

    public void ligarLampada(int indiceLampada) throws LampadaEstaLigada {
        LampadaInteligente lampada = this.vetor[indiceLampada];

        if (lampada.getEstado()) throw new LampadaEstaLigada();

        lampada.ligar();
    }

    public void desligarLampada(int indiceLampada) throws LampadaEstaDesligada {
        LampadaInteligente lampada = this.vetor[indiceLampada];

        if (!lampada.getEstado()) throw new LampadaEstaDesligada();

        lampada.desligar();
    }
}
