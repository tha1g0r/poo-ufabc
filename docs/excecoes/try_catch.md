# Captura de Exceções (`try-catch`)

```java
try {
    // Código que pode lançar exceção
} catch (Exception e) {
    // Tratamento da exceção
}
```

- **O Bloco `try` (tentar):** Nós colocamos aqui dentro o código "perigoso", ou seja, aquele que desconfiamos que pode gerar algum erro de execução.

- **O Bloco `catch` (capturar):** Se algo der errado dentro do `try`, o Java interrompe a execução normal naquele exato ponto e pula imediatamente para dentro do `catch`. Aqui nós decidimos o que fazer com o erro (como mostrar uma mensagem amigável ou salvar um log).

## Detalhamento do erro

Em Java, como estamos em uma linguagem orientada a objetos, absolutamente tudo o que acontece de errado é representado por um objeto. Essa variável `e` é uma instância da classe `Exception` (ou de alguma filha dela), carregando vários métodos úteis para investigação

Essa é uma forma bem comum de extrair informações desse objeto:

```java
} catch (Exception e) {
    System.out.println("Deu erro :(\n[" + e.toString() + "]");
}
```

### O que o objeto `e` nos oferece?

- `e.toString()`: Retorna o nome da classe da exceção acompanhado da mensagem descritiva do erro (por exemplo: `java.lang.ArrayIndexOutOfBoundsException: 5`).

- `e.getMessage()`: Retorna apenas o texto explicativo do erro (no caso anterior, retornaria apenas `"5"` ou a mensagem customizada que o programador criou).
