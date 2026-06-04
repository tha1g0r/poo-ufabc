package introducaopoo.dispositivos;

public class LampadaInteligente {
    private boolean ligada = false;

    public void ligar() {
        this.ligada = true;
    }

    public void desligar() {
        this.ligada = false;
    }

    public boolean getEstado() {
        return this.ligada;
    }
}
