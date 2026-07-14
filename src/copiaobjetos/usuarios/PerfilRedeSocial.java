package copiaobjetos.usuarios;

public class PerfilRedeSocial extends PerfilUsuario {
    private String msg = "Sem mensagem";

    public PerfilRedeSocial(String nome, String login) {
        super(nome, login);
    }

    public PerfilRedeSocial(String nome, String login, String mensagemPaginaInicial) {
        this(nome, login);
        this.msg = mensagemPaginaInicial;
    }

    public String getPerfil() {
        // "<nome> <mensagemPaginaInicial>"

        return String.format("%s %s", super.getNome(), this.msg);
    }
}
