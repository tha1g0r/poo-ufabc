package herancapolimorfismo.cartoes;

public class CartaoDebito {
    protected String titular;
    protected double saldo = 0;

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void adicionarSaldoDebito(double valor) {
        this.saldo += valor;
    }

    public double verificarSaldoDebito() {
        return this.saldo;
    }

    public boolean pagarComDebito(double valor) {
        if (this.saldo < valor) return false;

        this.saldo -= valor;
        return true;
    }
}
