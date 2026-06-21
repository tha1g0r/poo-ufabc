package herancapolimorfismo.navegador;

public class AbaRedeSocial extends AbaNavegador {
    public AbaRedeSocial(Navegador navegador, String titulo) {
        super(navegador, 2, titulo);
    }

    public void postar(String texto) {
        String registro = "Post: " + texto;

        this.navegadorDono.adicionarHistorico(registro);
    }

    @Override
    public String getTipo() {
        return "RedeSocial";
    }
}
