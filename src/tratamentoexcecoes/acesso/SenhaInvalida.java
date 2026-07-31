package tratamentoexcecoes.acesso;

public class SenhaInvalida extends Exception {
    private String login;

    public SenhaInvalida(String login) {
        super("A senha informada está incorreta para o usuário: " + login);
        this.login = login;
    }

    public String getLogin() {
        return this.login;
    }

    @Override
    public String toString() {
        return "Senha inválida para o usuário: " + this.getLogin();
    }
}
