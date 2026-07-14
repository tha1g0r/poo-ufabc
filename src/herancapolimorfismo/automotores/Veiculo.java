package herancapolimorfismo.automotores;

public class Veiculo {
    protected String modelo;

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return String.format("Veiculo generico modelo %s", this.modelo);
    }
}
