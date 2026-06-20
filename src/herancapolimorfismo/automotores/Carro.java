package herancapolimorfismo.automotores;

public class Carro extends Veiculo {
    private int nPortas;

    public void setNumeroPortas(int nPortas) {
        this.nPortas = nPortas;
    }

    public int getNumeroPortas() {
        return this.nPortas;
    }

    @Override
    public String getTipo() {
        return String.format("Carro modelo %s", this.modelo);
    }
}
