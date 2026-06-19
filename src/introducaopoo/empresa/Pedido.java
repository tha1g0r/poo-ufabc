package introducaopoo.empresa;

public class Pedido {
    private boolean entregue = false;
    private boolean cancelado = false;
    private int[] listaCodigos = new int[5];
    private int numeroCodigos = 0;

    private static int[] removerDuplicatas(int[] v) {
        int nFinal = v.length;
        for (int i = 0; i < v.length - 1; i++) {
            if (v[i] == -1) continue;
            for (int j = i + 1; j < v.length; j++) {
                if (v[j] == v[i]) {
                    v[j] = -1;
                    nFinal--;
                }
            }
        }

        int[] vetorFinal = new int[nFinal];
        int n = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] != -1) {
                vetorFinal[n++] = v[i];
            }
        }

        return vetorFinal;
    }

    private static int[] somaTotalVetores(int[] v1, int n1, int[] v2, int n2) {
        int[] vetorTotal = new int[n1 + n2];

        int i;
        for (i = 0; i < n1; i++) {
            vetorTotal[i] = v1[i];
        }
        for (i = n1; i < vetorTotal.length; i++) {
            vetorTotal[i] = v2[i - n1];
        }

        return vetorTotal;
    }

    public boolean adicionarProduto(int codProduto) {
        if ((this.entregue) || (this.cancelado) || (this.numeroCodigos >= 5)) return false;
        for (int i = 0; i < this.numeroCodigos; i++) {
            if (this.listaCodigos[i] == codProduto) return false;
        }

        this.listaCodigos[numeroCodigos++] = codProduto;
        return true;
    }

    public int[] entregar() {
        if ((this.cancelado) || (numeroCodigos == 0)) return null;

        int[] pedidosEntregues = new int[numeroCodigos];
        for (int i = 0; i < numeroCodigos; i++) {
            pedidosEntregues[i] = listaCodigos[i];
        }

        this.entregue = true;

        return pedidosEntregues;
    }

    public boolean cancelar() {
        if (this.entregue) return false;

        this.cancelado = true;
        return true;
    }

    public boolean somarPedido(Pedido p) {
        int[] vetorTotal = somaTotalVetores(this.listaCodigos, this.numeroCodigos, p.listaCodigos, p.numeroCodigos);
        int[] vetorSemDuplicatas = removerDuplicatas(vetorTotal);

        if (vetorSemDuplicatas.length > 5) return false;

        this.listaCodigos = new int[5];
        for (int i = 0; i < vetorSemDuplicatas.length; i++) {
            this.listaCodigos[i] = vetorSemDuplicatas[i];
        }
        this.numeroCodigos = vetorSemDuplicatas.length;
        return true;
    }
}
