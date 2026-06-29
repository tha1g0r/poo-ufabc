package aulainterfaces.relatorio;

public class TextoData implements PluginTexto {
    private int dia;
    private int mes;
    private int ano;

    public TextoData(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String aplicar(String texto) {
        String apendice = String.format(" (DATA: %d/%d/%d)", this.dia, this.mes, this.ano);

        return texto + apendice;
    }
}
