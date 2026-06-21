package herancapolimorfismo.navegador;

public class AbaBuscador extends AbaNavegador {
    public AbaBuscador(Navegador navegador, String titulo) {
        super(navegador, 1, titulo);
    }

    public void buscar(String expressao) {
        String registro = "Busca: " + expressao;

        this.navegadorDono.adicionarHistorico(registro);
    }

    @Override
    public String getTipo() {
        return "Buscador";
    }
}
