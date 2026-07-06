package copiaobjetos.projetoautocorrecao.autocorrecao;

public class Pergunta {
	private String textoPergunta;
	private Alternativa[] alternativas;
	private int indiceAltCorreta = -1;
	private int qtd = 0;

	public Pergunta(int qtdAlternativas, String textoPergunta) {
		this.alternativas = new Alternativa[qtdAlternativas];
		this.textoPergunta = textoPergunta;
	}

	public String getTextoPergunta() {
		return this.textoPergunta;
	}

	public void adicionarAlternativa(Alternativa alt, boolean correta) {
		if (qtd == alternativas.length) {
			System.out.println("Lista de alternativas esta cheia.");
			return;
		}
		alternativas[qtd++] = alt;
		if (correta) {
			if (this.indiceAltCorreta != -1) {
				System.out.println("Existe outra alternativa correta.");
			} else {
				this.indiceAltCorreta = qtd - 1;
			}
		}
	}
	
	public void imprimir() {
		System.out.println(textoPergunta);
		for (int i = 0; i < qtd; i++)
			System.out.println("- " + alternativas[i].getDescricao());
	}
}
