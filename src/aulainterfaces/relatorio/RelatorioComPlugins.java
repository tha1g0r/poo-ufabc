package aulainterfaces.relatorio;

public class RelatorioComPlugins extends Relatorio {
    private PluginImpressao pluginImpressao;

    public RelatorioComPlugins(String autor) {
        super(autor);
    }

    public void aplicarPluginTexto(PluginTexto plugin) {
        String texto = super.getTexto();

        texto = plugin.aplicar(texto);

        super.setTexto(texto);
    }

    public void setPluginImpressao(PluginImpressao p) {
        this.pluginImpressao = p;
    }

    public void imprimirRelatorio() {
        this.pluginImpressao.imprimir(this);
    }
}
