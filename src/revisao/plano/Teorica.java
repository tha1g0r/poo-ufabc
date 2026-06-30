package revisao.plano;

public class Teorica extends Aula {
    public Teorica(String descricao) {
		this(descricao, 2);
	}

    public Teorica(String descricao, int cargaHoraria) {
		super.setDescricao(descricao);
        super.setCargaHoraria(cargaHoraria);
	}

	@Override
	public String getTipo() {
		return "Teorica";
	}
}
