package padroesprojetosoftware.dispositivos;

abstract class DispositivoInteligente {
    private boolean estado = false;

    public void ligar() {
        if (this.estado == true) return;
        this.estado = true;
    }

    public void desligar() {
        if (this.estado == false) return;
        this.estado = false;
    }

    public boolean getEstado() {
        return this.estado;
    }
}
