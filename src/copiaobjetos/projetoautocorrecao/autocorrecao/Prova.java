package copiaobjetos.projetoautocorrecao.autocorrecao;

public class Prova {
	private Pergunta[] perguntas;
	private int indiceUltimaPergunta;

	public Prova(int qtdPerguntas) {
		this.perguntas = new Pergunta[qtdPerguntas];
		this.indiceUltimaPergunta = -1;
	}

	public void adicionarPergunta(Pergunta novaPergunta) {
		if (indiceUltimaPergunta + 1 >= perguntas.length) {
			System.out.println("Vetor de perguntas esta cheio.");
		} else {
			perguntas[++indiceUltimaPergunta] = novaPergunta;
		}
	}
	
	public void imprimir() {
		System.out.println("-----------------");
		for (Pergunta pergunta : perguntas)
			if (pergunta != null)
				pergunta.imprimir();
	}
}
