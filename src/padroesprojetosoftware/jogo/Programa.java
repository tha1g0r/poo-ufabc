package padroesprojetosoftware.jogo;

public class Programa {
    public static void main(String[] args) {
        System.out.println("Iniciando Jogo da Velha...");
        
        // Instancia o tabuleiro que gerencia as estratégias
        TabuleiroEstrategia tabuleiro = new TabuleiroEstrategia();
        
        // Instancia as estratégias que você implementou
        EstrategiaJogo estrategiaA = new EstrategiaA();
        EstrategiaJogo estrategiaB = new EstrategiaB();
        
        // Define a Estratégia A para o jogador 1 ('X')
        tabuleiro.setStrategyJogador1(estrategiaA);
        
        // Define a Estratégia B para o jogador 2 ('O')
        tabuleiro.setStrategyJogador2(estrategiaB);
        
        // Executa a partida intercalando as jogadas
        System.out.println("Partida: Estratégia A (X) vs Estratégia B (O)");
        tabuleiro.jogarPartida();
        
        // Verifica e imprime o resultado final
        char vencedor = tabuleiro.getJogadorVencedor();
        if (vencedor == '-') {
            System.out.println("Resultado: O jogo terminou empatado!");
        } else if (vencedor != '.') {
            System.out.println("Resultado: O vencedor foi o jogador '" + vencedor + "'!");
        }
    }
}
