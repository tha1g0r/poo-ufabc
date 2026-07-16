package padroesprojetosoftware.dispositivos;

public class Gerenciador {
    private DispositivoInteligente[] dispositivos = new DispositivoInteligente[10];
    private int n = 0;

    public void adicionarDispositivo(DispositivoInteligente d) {
        if (this.n == 10) return;
        this.dispositivos[n++] = d;
    }

    public void ligarTodosDispositivos() {
        if (this.n == 0) return;
        for (int i = 0; i < this.n; i++) {
            this.dispositivos[i].ligar();
        }
    }

    public void desligarTodosDispositivos() {
        if (this.n == 0) return;
        for (int i = 0; i < this.n; i++) {
            this.dispositivos[i].desligar();
        }
    }

    public void obterEstados() {
        for (int i = 0; i < this.n; i++) {
            System.out.println(this.dispositivos[i].getEstado());
        }
    }
}
