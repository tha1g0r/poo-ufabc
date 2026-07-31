package tratamentoexcecoes.acesso;

public class UsuarioBloqueado extends Exception {
    private String login;

    public UsuarioBloqueado(String login) {
        super("O acesso do usuário " + login + " está bloqueado.");
        this.login = login;
    }

    public String getLogin() {
        return this.login;
    }

    @Override
    public String toString() {
        return "Usuário bloqueado: " + this.getLogin();
    }
}
