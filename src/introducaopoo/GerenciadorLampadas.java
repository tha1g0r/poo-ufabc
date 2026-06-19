package src.introducaopoo;

import src.introducaopoo.dispositivos.LampadaInteligente;

public class GerenciadorLampadas {
    private LampadaInteligente[] listaLampadas = new LampadaInteligente[10];
    private int numeroLampadas = 0;

    public void adicionarLampada() {
        if (this.numeroLampadas < this.listaLampadas.length) {
            LampadaInteligente novaLampada = new LampadaInteligente();

            listaLampadas[numeroLampadas++] = novaLampada;
        }
    }

    public void ligarLampada(int indiceLampada) {
        LampadaInteligente lampada = listaLampadas[indiceLampada];

        if (! lampada.getEstado()) lampada.ligar();
    }

    public void desligarLampada(int indiceLampada) {
        LampadaInteligente lampada = listaLampadas[indiceLampada];

        if (lampada.getEstado()) lampada.desligar();
    }

    public void ligarTodasLampadas() {
        for (int i = 0; i < numeroLampadas; i++) listaLampadas[i].ligar();

    }

    public void desligarTodasLampadas() {
        for (int i = 0; i < numeroLampadas; i++) listaLampadas[i].desligar();
    }
}
