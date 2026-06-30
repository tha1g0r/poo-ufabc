// BLOQUEADO

package aulainterfaces.machinelearning;

public class ProgramaAvaliar {
    public static void main(String[] args) {
        // Instancia DadosTestePadrao
        DadosTeste d1 = new DadosTestePadrao();

        // Instancia DadosTesteDesbalanceado sem especificar a fonte (considerar "Nao informado" neste caso)
        DadosTeste d2 = new DadosTesteDesbalanceado();

        // Instancia DadosTesteDesbalanceado especificando a fonte "ABC"
        DadosTeste d3 = new DadosTesteDesbalanceado("ABC");

        d1.setClasses(new String[] {"C1", "C 2"});
        d1.adicionarExemplo(new Exemplo(new int[] {1, 2, 3}, "C1", "C1"));
        d1.adicionarExemplo(new Exemplo(new int[] {1, 2, 3}, "C1", "C 2"));
        d1.adicionarExemplo(new Exemplo(new int[] {1, 2, 3}, "C1", "C1"));
        d1.adicionarExemplo(new Exemplo(new int[] {1, 2, 3}, "C1", "C1"));
        d1.adicionarExemplo(new Exemplo(new int[] {1, 2, 3}, "C1", "C1"));
        d1.adicionarExemplo(new Exemplo(new int[] {1, 2, 3}, "C 2", "C 2"));
        d1.adicionarExemplo(new Exemplo(new int[] {1, 2, 3}, "C 2", "C 2"));
        d1.adicionarExemplo(new Exemplo(new int[] {1, 2, 3}, "C 2", "C 2"));
        d1.adicionarExemplo(new Exemplo(new int[] {1, 2, 3}, "C 2", "C1"));
        d1.adicionarExemplo(new Exemplo(new int[] {1, 2, 3}, "C 2", "C1"));

        d2.adicionarExemplo(d1);
        d2.setClasses(new String[] {"C1", "C 2"});
        d2.adicionarExemplo(new Exemplo(new int[] {1, 2, 3}, "C 2", "C 2"));
        d2.adicionarExemplo(new Exemplo(new int[] {1, 2, 3}, "C 2", "C1"));
        d2.adicionarExemplo(new Exemplo(new int[] {1, 2, 3}, "C 2", "C1"));
        d2.adicionarExemplo(new Exemplo(new int[] {1, 2, 3}, "C 2", "C1"));
        d2.adicionarExemplo(new Exemplo(new int[] {1, 2, 3}, "C 2", "C1"));

        d3.setClasses(new String[] {"C1", "C 2", "Classe3"});
        d3.adicionarExemplo(d2);
        d3.adicionarExemplo(new Exemplo(new int[] {1, 2, 3}, "Classe3", "C 2"));
        d3.adicionarExemplo(new Exemplo(new int[] {1, 2, 3}, "Classe3", "Classe3"));
        d3.adicionarExemplo(new Exemplo(new int[] {1, 2, 3}, "Classe3", "Classe3"));
        d3.adicionarExemplo(new Exemplo(new int[] {1, 2, 3}, "Classe3", "Classe3"));
        d3.adicionarExemplo(new Exemplo(new int[] {1, 2, 3}, "Classe3", "Classe3"));
        d3.adicionarExemplo(new Exemplo(new int[] {1, 2, 3}, "Classe3", "C1"));
        d3.adicionarExemplo(new Exemplo(new int[] {1, 2, 3}, "Classe3", "Classe3"));
        d3.adicionarExemplo(new Exemplo(new int[] {1, 2, 3}, "Classe3", "Classe3"));

        // Adiciona mais exemplos em d1
        d1.adicionarExemplo(new Exemplo(new int[] {1, 2, 3}, "C 2", "C 2"));
        d1.adicionarExemplo(new Exemplo(new int[] {1, 2, 3}, "C 2", "C 2"));
        d1.adicionarExemplo(new Exemplo(new int[] {1, 2, 3}, "C 2", "C 2"));

        // Imprime o resultado de calcularAcuracia para cada conjunto de dados
        // Observe que DadosTestePadrao calcula a acurácia padrão,
        // enquanto que DadosTesteDesbalanceado calcula a acurácia balanceada
        System.out.println(String.format("d1.calcularAcuracia() = %.2f", d1.calcularAcuracia()));
        System.out.println(String.format("d2.calcularAcuracia() = %.2f", d2.calcularAcuracia()));
        System.out.println(String.format("d3.calcularAcuracia() = %.2f", d3.calcularAcuracia()));

        // Imprime a fonte de d1 e de d2
        System.out.println(String.format("Fonte (d2): %s", ((DadosTesteDesbalanceado) d2).getFonte()));
        System.out.println(String.format("Fonte (d3): %s", ((DadosTesteDesbalanceado) d3).getFonte()));

        // Verifica se a fonte de dados é "ABC"
        System.out.println(String.format("Fonte (d2) eh ABC? %s", DadosTesteDesbalanceado.verificarFonte( (DadosTesteDesbalanceado) d2)));
        System.out.println(String.format("Fonte (d3) eh ABC? %s", DadosTesteDesbalanceado.verificarFonte( (DadosTesteDesbalanceado) d3)));
    }
}
