package copiaobjetos.multimidiadois;

public class Playlist implements Cloneable {
    private ArquivoMultimidia[] arquivos = new ArquivoMultimidia[100];
    private int nArquivos = 0;

    // public Playlist() {}

    public void adicionarItem(ArquivoMultimidia arquivo) {
        this.arquivos[this.nArquivos++] = arquivo;
    }

    public void renomearItem(int indiceArquivo, String novoNomeArquivo) {
        this.arquivos[indiceArquivo].setNomeArquivo(novoNomeArquivo);
    }

    public void moverParaInicio(int indiceArquivo) {
        ArquivoMultimidia temp = this.arquivos[indiceArquivo];
        int indiceVazio = indiceArquivo;

        while (indiceVazio != 0) {
            this.arquivos[indiceVazio] = this.arquivos[indiceVazio - 1];
            indiceVazio--;
        }

        this.arquivos[indiceVazio] = temp;
    }

    public String[] listarArquivos() {
        String[] v = new String[this.nArquivos];

        for (int i = 0; i < nArquivos; i++) {
            v[i] = this.arquivos[i].getNomeArquivo();
        }
        
        return v;
    }

    @Override
    public Playlist clone() throws CloneNotSupportedException {
        Playlist novaPlaylist = (Playlist) super.clone();
        ArquivoMultimidia[] novosArquivos = new ArquivoMultimidia[100];

        for(int i = 0; i < this.nArquivos; i++) {
            novosArquivos[i] = this.arquivos[i].clone();
        }
        novaPlaylist.arquivos = novosArquivos;

        return novaPlaylist;
    }
}
