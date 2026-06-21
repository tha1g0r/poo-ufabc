package herancapolimorfismo.navegador;

public abstract class AbaNavegador {
    protected int tipo;
    protected String titulo;
    protected Navegador navegadorDono;

    public AbaNavegador(Navegador navegador, int tipo, String titulo) {
        this.navegadorDono = navegador;
        this.tipo = tipo;
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public abstract String getTipo();
}
