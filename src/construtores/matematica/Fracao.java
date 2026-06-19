package construtores.matematica;

public class Fracao {
    private int numerador;
    private int denominador;

    public Fracao() {
        this(1);
    }

    public Fracao(int numerador) {
        this(numerador, 1);
    }

    public Fracao(int numerador, int denominador) {
        int divisorComum = mdc(numerador, denominador);

        this.numerador = numerador/divisorComum;
        this.denominador = denominador/divisorComum;
    }

    private static int mdc(int x, int y) {
        if (y == 0) {
            return x;
        }
        return mdc(y, x % y);
    }

    // private static int mmc(int a, int b) {
    //     return a * (b / mdc(a, b));
    // }

    public String getRepresentacao() {
        return String.format("%d/%d", this.numerador, this.denominador);
    }

    public Fracao somar(Fracao f2) {
        return somar(this, f2);
    }

    public static Fracao somar(Fracao f1, Fracao f2) {
        int denominador = f1.denominador * f2.denominador;
        int numerador = f1.numerador * f2.denominador + f2.numerador * f1.denominador;

        return new Fracao(numerador, denominador);
    }

    public static Fracao somar(Fracao[] fracoes) {
        Fracao fracaoResultante = fracoes[0];

        for (int i = 1; i < fracoes.length; i++) {
            fracaoResultante = fracaoResultante.somar(fracoes[i]);
        }

        return fracaoResultante;
    }

    public static Fracao multiplicar(Fracao f1, Fracao f2) {
        int numerador = f1.numerador * f2.numerador;
        int denominador = f1.denominador * f2.denominador;

        return new Fracao(numerador, denominador);
    }
}
