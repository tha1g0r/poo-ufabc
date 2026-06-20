package herancapolimorfismo.automotores;

public class Motocicleta extends Veiculo {
    private boolean temCarroLateral;

    public void setTemCarroLateral(boolean temCarroLateral) {
        this.temCarroLateral = temCarroLateral;
    }

    public boolean getTemCarroLateral() {
        return this.temCarroLateral;
    }

    @Override
    public String getTipo() {
        return String.format("Motocicleta modelo %s", this.modelo);
    }
}
