package aulainterfaces.relatorio;

public class TextoTitulo implements PluginTexto {
    private String titulo;

    public TextoTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String aplicar(String texto) {
        String apendice = String.format("(TITULO: %s) ", this.titulo);

        return apendice + texto;
    }
}
