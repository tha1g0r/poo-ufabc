package herancapolimorfismo.navegador;

public class Navegador {
    private int nMaxAbas;
    private AbaNavegador[] abasAbertas;
    private int nAbasAbertas = 0;

    private String[] historico = new String[100];
    private int nRegistros = 0;

    public Navegador(int limiteAbas) {
        this.nMaxAbas = limiteAbas;
        this.abasAbertas = new AbaNavegador[nMaxAbas];
    }

    public AbaNavegador abrirAba(int tipo, String titulo) {
        if (nAbasAbertas > nMaxAbas) return null;

        AbaNavegador novaAba;
        switch (tipo) {
            case 1:
                novaAba = new AbaBuscador(this, titulo);
                break;
            case 2:
                novaAba = new AbaRedeSocial(this, titulo);
                break;
            default:
                novaAba = null;
                break;
        }

        this.abasAbertas[nAbasAbertas++] = novaAba;
        return novaAba;
    }

    public void fecharAba(AbaNavegador aba) {
        // buscar e trocar por null
        int posicaoEncontrada = -1;
        for (int i = 0; i < nMaxAbas; i++) {
            if (this.abasAbertas[i] == aba) {
                posicaoEncontrada = i;
                break;
            }
        }

        // trocar null por proximos
        if (posicaoEncontrada != -1) {
            for (int i = posicaoEncontrada; i < nMaxAbas - 1; i++) {
                this.abasAbertas[i] = this.abasAbertas[i + 1];
            }

            this.abasAbertas[nMaxAbas - 1] = null;
            this.nAbasAbertas--;
        }
    }

    public String[] getAbas() {
        String[] descricaoAbas = new String[this.nAbasAbertas];

        for (int i = 0; i < nAbasAbertas; i++) {
            AbaNavegador abaAtual = this.abasAbertas[i];
            descricaoAbas[i] = String.format("%d %s", abaAtual.tipo, abaAtual.titulo);
        }

        return descricaoAbas;
    }

    public void adicionarHistorico(String registro) {
        this.historico[nRegistros++] = registro;
    }

    public String[] getHistorico() {
        return new String[0];
    }
}
