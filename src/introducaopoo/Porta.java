package src.introducaopoo;

public class Porta {
    private boolean aberta = true;
    private String nome = "Porta sem nome";

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public boolean estaAberta() {
        return this.aberta;
    }

    public int abrir() {
        if (this.aberta) {
            return 1;
        }

        this.aberta = true;
        return 0;
    }

    public int fechar() {
        if (! this.aberta) {
            return 1;
        }

        this.aberta = false;
        return 0;
    }
}
