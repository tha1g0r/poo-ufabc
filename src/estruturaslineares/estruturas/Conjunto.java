package estruturaslineares.estruturas;

public class Conjunto implements Lista {
    private int qtdMax = 100;
    private int[] vetor = new int[qtdMax];
    private int qtd = 0;

    public Conjunto uniao(Conjunto c) {
        int nMax = this.qtd + c.qtd;
        Conjunto novoConjunto = new Conjunto();
        novoConjunto.vetor = new int[nMax];

        for (int i = 0; i < this.qtd; i++) {
            novoConjunto.adicionar(this.vetor[i]);
        }

        for (int i = this.qtd; i < nMax; i++) {
            novoConjunto.adicionar(c.vetor[i - this.qtd]);
        }

        return novoConjunto;
    }

    public static Conjunto uniao(Conjunto a, Conjunto b) {
        return a.uniao(b);
    }

    public Conjunto intersecao(Conjunto c) {
        Conjunto novoConjunto = new Conjunto();

        for (int i = 0; i < this.qtd; i++) {
            int elemento = this.vetor[i];

            if (c.buscar(elemento) != -1) novoConjunto.adicionar(elemento);
        }

        return novoConjunto;
    }

    public static Conjunto intersecao(Conjunto a, Conjunto b) {
        return a.intersecao(b);
    }

    @Override
    public int getQtd() {
        return this.qtd;
    }

    @Override
    public void adicionar(int numero) {
        if (this.buscar(numero) == -1) this.vetor[this.qtd++] = numero;
    }

    @Override
    public void remover(int numero) {
        int idx = this.buscar(numero);

        for (int i = idx + 1; i < this.qtd; i++) {
            vetor[i - 1] = vetor[i];
        }

        this.qtd--;
    }

    @Override
    public int buscar(int numero) {
        for (int i = 0; i < this.qtd; i++) {
            if (this.vetor[i] == numero) return i;
        }

        return -1;
    }

    @Override
    public String toString() {
        if (this.qtd == 0) {
            return "{ }";
        }

        String representacao = "{ ";
        for (int i = 0; i < this.qtd - 1; i++) {
            representacao += vetor[i] + " ";
        }
        representacao += vetor[this.qtd - 1];
        representacao += " }";

        return representacao;
    }
}
