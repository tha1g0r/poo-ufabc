package introducaopoo.universidade;

public class Disciplina {
    private String titulo;
    private int numeroCreditos;

    public void setNome(String nomeDisciplina) {
        this.titulo = nomeDisciplina;
    }

    public String getNome() {
        return this.titulo;
    }

    public void setQtdCreditos(int qtdCreditos) {
        this.numeroCreditos = qtdCreditos;
    }

    public int getQtdCreditos() {
        return this.numeroCreditos;
    }

    public String getTituloCreditos() {
        return String.format("%s: %d", this.titulo, this.numeroCreditos);
    }
}
