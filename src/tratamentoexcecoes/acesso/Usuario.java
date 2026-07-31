package tratamentoexcecoes.acesso;

public class Usuario {
    private String login;
    private String senha;
    private boolean bloqueado;

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
        this.bloqueado = false;
    }

    public String getLogin() {
        return this.login;
    }

    public void autenticar(String senha) throws SenhaInvalida, UsuarioBloqueado {
        if (this.bloqueado) throw new UsuarioBloqueado();

        if (!this.senha.equals(senha)) throw new SenhaInvalida();
    }
}
