package padroesprojetosoftware.jogo;

public class TabuleiroEstrategia extends Tabuleiro {
    private EstrategiaJogo estrategiaPlayer1;
    private EstrategiaJogo estrategiaPlayer2;

    private int proximoJogador = 1;

    public void setStrategyJogador1(EstrategiaJogo jogador1) {
        this.estrategiaPlayer1 = jogador1;
    }

    public void setStrategyJogador2(EstrategiaJogo jogador2) {
        this.estrategiaPlayer2 = jogador2;
    }

    public void jogarPartida() {
        char vencedor = super.getJogadorVencedor();

        while (vencedor == '.') {
            if (this.proximoJogador == 1) {
                int[] coordenadas = this.estrategiaPlayer1.getProximaJogada(getTabuleiro(), 'X');
                super.jogar('X', coordenadas[0], coordenadas[1]);
                this.proximoJogador = 2;
            } else if (this.proximoJogador == 2) {
                int[] coordenadas = this.estrategiaPlayer2.getProximaJogada(getTabuleiro(), 'O');
                super.jogar('O', coordenadas[0], coordenadas[1]);
                this.proximoJogador = 1;
            }

            vencedor = super.getJogadorVencedor();
        }
    }
}
