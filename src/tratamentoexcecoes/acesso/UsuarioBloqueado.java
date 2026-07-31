package tratamentoexcecoes.acesso;

public class UsuarioBloqueado extends Exception {
    public UsuarioBloqueado() {
        super("O acesso deste usuário está bloqueado.");
    }

    public UsuarioBloqueado(String mensagem) {
        super(mensagem);
    }
}
