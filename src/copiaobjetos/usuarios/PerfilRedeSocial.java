package copiaobjetos.usuarios;

public class PerfilRedeSocial extends PerfilUsuario {
    private String msg;

    PerfilRedeSocial(String nome, String login) {
        super(nome, login);
    }

    PerfilRedeSocial(String nome, String login, String mensagemPaginaInicial) {
        this(nome, login);
        this.msg = mensagemPaginaInicial;
    }

    String getPerfil() {
        // "<nome> <mensagemPaginaInicial>"

        return String.format("%s %s", super.getNome(), this.msg);
    }
}
