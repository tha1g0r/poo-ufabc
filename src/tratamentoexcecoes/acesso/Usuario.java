package tratamentoexcecoes.acesso;

public class Usuario {
    private String login;
    private String senha;

    private boolean bloqueado = false;
    private int erros = 0;

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return this.login;
    }

    public void autenticar(String senha) throws SenhaInvalida, UsuarioBloqueado {
        if (this.bloqueado) {
            throw new UsuarioBloqueado(this.login);
        }

        if (!this.senha.equals(senha)) {
            this.erros++;
            if (this.erros >= 3) {
                this.bloqueado = true;
                throw new UsuarioBloqueado(this.login);
            }

            throw new SenhaInvalida(this.login);
        }

        this.erros = 0; 
    }

    @Override
    public String toString() {
        return "Usuário " + this.login + " autenticado com sucesso!";
    }
}
