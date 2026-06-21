package herancapolimorfismo.cartoes;

public class CartaoCredito extends CartaoDebito {
    protected double valorFatura = 0;

    public boolean pagarComCredito(double valor) {
        this.valorFatura += valor;
        return true;
    }

    public void quitarCredito(double valor) {
        this.valorFatura -= valor;
    }

    public double verificarExtrato() {
        return this.valorFatura;
    }
}
