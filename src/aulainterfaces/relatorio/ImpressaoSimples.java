package aulainterfaces.relatorio;

public class ImpressaoSimples implements PluginImpressao {
    public void imprimir(Relatorio r) {
        System.out.println(r.getTexto());
    }
}
