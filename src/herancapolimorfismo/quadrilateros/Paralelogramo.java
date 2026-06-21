package herancapolimorfismo.quadrilateros;

public class Paralelogramo extends Quadrilatero {
    public void setLados(double ladoAB, double ladoBC) {
        super.setLados(ladoAB, ladoBC, ladoAB, ladoBC);
    }

    @Override
    public String getPropriedades() {
        return super.getPropriedades() + " Lados opostos paralelos.";
    }
}
