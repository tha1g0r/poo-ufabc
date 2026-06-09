# Lançamento de Exceções (`throw`/`throws`)

Em Java, nós usamos a palavra-chave `throw` quando queremos criar um erro e "lançá-lo" intencionalmente no programa. Isso geralmente acontece quando uma validação de regra de negócio falha.

Olha este trecho do método `adicionarPergunta` da classe `Prova`:

```java
public void adicionarPergunta(Pergunta novaPergunta) throws Exception { 
    if (indiceUltimaPergunta + 1 >= perguntas.length) { 
        throw new Exception("Vetor de perguntas esta cheio."); // Corta a execução aqui
    } 
    
    perguntas[++indiceUltimaPergunta] = novaPergunta; 
}
```

1. **A Condição:** O `if` verifica se o vetor que guarda as perguntas atingiu o limite máximo de tamanho.

2. **A Ação:** Se o vetor estiver cheio, o programa não deve continuar tentando inserir dados. Em vez de apenas imprimir uma mensagem na tela (o que permitiria ao programa continuar rodando com dados errados), o código usa `throw new Exception(...)`.

3. **A Instanciação**: Como conversamos antes, exceções são objetos. Por isso usamos o operador `new` para construir um novo objeto da classe `Exception`, passando o texto explicativo do erro no construtor.

Assim que a linha do `throw` é executada, o método é interrompido imediatamente e a "bomba" do erro é lançada para quem chamou esse método tratar.

## O Comando `throws`

Repare que na assinatura do método fomos obrigados a colocar o termo `throws Exception`.

Em Java, existem dois grandes grupos de exceções:

1. **Unchecked Exceptions (Não checadas):** Erros de lógica de programação (como o `ArrayIndexOutOfBoundsException` que vimos antes ). O Java não te obriga a avisar que eles podem acontecer.

2. **Checked Exceptions (Checadas):** Erros que o Java te obriga a tratar ou avisar explicitamente que podem acontecer. A classe genérica `Exception` entra nessa categoria.

Como usamos a classe base `Exception` para criar o erro (`throw new Exception(...)`) , o compilador do Java exige que o método use o `throws Exception` na sua assinatura. É uma forma de dizer de antemão para qualquer programador que for usar esse método: *"Atenção! Quem me chamar vai ter que se virar usando um bloco `try-catch` para se proteger"*.

## O Efeito Cascata

```java
public void adicionarAlternativa(String alternativa) throws Exception {
    this.adicionarAlternativa(false, new Alternativa(alternativa)); // Chama o método de baixo
}

public void adicionarAlternativa(boolean correta, Alternativa alternativa) throws Exception {
    if (indiceUltimaAlternativa + 1 >= alternativas.length) {
        throw new Exception("Lista de alternativas esta cheia."); // O erro nasce aqui
    }
    // ... restando do código
}
```

O método que recebe apenas a `String` não faz nenhum `throw` direto. Mesmo assim, **a exceção lançada no método sobrecarregado pode chegar até ele, portanto, requer o `throws` também**.
