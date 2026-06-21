package herancapolimorfismo.quadrilateros;

public class Quadrilatero {
    protected double ladoAB;
    protected double ladoBC;
    protected double ladoCD;
    protected double ladoDA;
    protected double perimetro;

    public void setLados(double ladoAB, double ladoBC, double ladoCD, double ladoDA) {
        this.ladoAB = ladoAB;
        this.ladoBC = ladoBC;
        this.ladoCD = ladoCD;
        this.ladoDA = ladoDA;

        this.perimetro = this.ladoAB + this.ladoBC + this.ladoCD + this.ladoDA;
    }

    public double getPerimetro() {
        return this.perimetro;
    }

    public String getPropriedades() {
        return "Figura de quatro lados.";
    }
}
