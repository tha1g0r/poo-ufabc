package padroesprojetosoftware.jogo;

class EstrategiaA implements EstrategiaJogo {
    private int[][] estrategia = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
    private int proximaJogada = 1;

    public int[] getProximaJogada(char[][] dadosTabuleiro, char jogador) {
        int[] coordenadas = new int[]{-1, -1};

        busca:
        while(this.proximaJogada <= 9) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {

                    if (this.estrategia[i][j] == this.proximaJogada) {

                        if (dadosTabuleiro[i][j] != '.') {
                            this.proximaJogada++;
                            continue busca;
                        } else {
                            coordenadas[0] = i;
                            coordenadas[1] = j;
                            break busca;
                        }
                    }
                }
            }
        }

        return coordenadas;
    }
}
