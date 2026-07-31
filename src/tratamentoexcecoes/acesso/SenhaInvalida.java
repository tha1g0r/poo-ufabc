package tratamentoexcecoes.acesso;

public class SenhaInvalida extends Exception {
    public SenhaInvalida() {
        super("A senha informada está incorreta.");
    }

    public SenhaInvalida(String mensagem) {
        super(mensagem);
    }
}
