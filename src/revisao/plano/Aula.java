package revisao.plano;

public abstract class Aula {
    private String descricao;
    private int cargaHoraria;

	public String getDescricao() {
		return this.descricao;
	}
	
	protected void setDescricao(String descricao) {
		this.descricao = descricao;
	}

    protected void setCargaHoraria(int c) {
        this.cargaHoraria = c;
    }

    public int getCargaHoraria() {
        return this.cargaHoraria;
    }

	public abstract String getTipo();
}
