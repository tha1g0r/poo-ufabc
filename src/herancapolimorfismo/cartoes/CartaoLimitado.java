package herancapolimorfismo.cartoes;

public class CartaoLimitado extends CartaoCredito {
    private double limite = 200;

    @Override
    public boolean pagarComCredito(double valor) {
        if (valor > this.limite) {
            return false;
        }

        return super.pagarComCredito(valor);
    }
}
