import autocorrecao.Prova;
import autocorrecao.Pergunta;
import autocorrecao.Alternativa;

public class Programa {
	public static void main(String[] args) {
		Pergunta pergunta1 = new Pergunta(2, "O que eh a sigla POO?");
		Alternativa a1 = new Alternativa("Programacao Estruturada");
		Alternativa a2 = new Alternativa("Programacao Orientada a Objetos");
		pergunta1.adicionarAlternativa(a1, false);
		pergunta1.adicionarAlternativa(a2, true);
			
		Pergunta pergunta2 = new Pergunta(2, "O que sao construtores?");
		pergunta2.adicionarAlternativa(new Alternativa("Metodos chamados quando a classe eh instanciada"), true);
		pergunta2.adicionarAlternativa(new Alternativa("Variaveis globais"), false);
		
		Prova p1 = new Prova(2);
		p1.adicionarPergunta(pergunta1);
		p1.adicionarPergunta(pergunta2);
		
		p1.imprimir();
	}
}