package revisao.plano;

public abstract class Aula {
    private String descricao;

	public String getDescricao() {
		return this.descricao;
	}
	
	protected void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public abstract String getTipo();
}
