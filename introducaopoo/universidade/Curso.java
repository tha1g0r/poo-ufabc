package introducaopoo.universidade;

public class Curso {
    private String titulo;
    private Disciplina[] listaDisciplinas;
    private int numeroDisciplinasListadas = 0;

    public void setNome(String nomeCurso) {
        this.titulo = nomeCurso;
    }

    public String getNome() {
        return this.titulo;
    }

    public void setMaxDisciplinas(int maxDisciplinas) {
        this.listaDisciplinas = new Disciplina[maxDisciplinas];
    }

    public boolean adicionarDisciplina(Disciplina disciplina) {
        if (this.numeroDisciplinasListadas < this.listaDisciplinas.length) {
            this.listaDisciplinas[numeroDisciplinasListadas++] = disciplina;

            return true;
        }

        return false;
    }

    public String[] getListaDisciplinasStr() {
        if (numeroDisciplinasListadas == 0) return null;

        String[] listaTitulosCreditos = new String[this.numeroDisciplinasListadas];

        for (int i = 0; i < this.numeroDisciplinasListadas; i++) {
            listaTitulosCreditos[i] = this.listaDisciplinas[i].getTituloCreditos();
        }

        return listaTitulosCreditos;
    }
}
