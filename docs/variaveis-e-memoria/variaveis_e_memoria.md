# Visão Geral: Variáveis e Memória

No Java, entender como a memória funciona depende diretamente do tipo de variável que estamos utilizando. O ecossistema Java divide as variáveis em duas grandes categorias:

## 1. Tipos Primitivos

- **O que são:** Tipos básicos nativos da linguagem, como `int`, `float`, `double`, `boolean`, entre outros.
- **Comportamento na memória:** Variáveis primitivas armazenam o valor direto na memória. Quando você copia uma variável primitiva para outra (`n2 = n1`), o valor é duplicado. Alterar `n2` posteriormente não afeta o valor de `n1`.

## 2. Tipo de Referência

- **O que são:** Variáveis que apontam para objetos (instâncias de classes) ou vetores (arrays).
- **Comportamento na memória:** Elas não guardam o objeto em si, mas sim um **ponteiro (endereço)** para onde o objeto está na memória.
- **O efeito da cópia:** Se você fizer `user2 = user1`, você estará copiando apenas a referência (o endereço). Isso significa que ambas as variáveis passam a apontar para a **mesma instância** do objeto. Se você alterar o objeto usando `user2`, a mudança será refletida ao acessar `user1`. O mesmo comportamento ocorre com vetores.

## 3. Gerenciamento de Memória Automático

- **Cadê o free?:** Ao contrário de linguagens como C, o Java não possui uma liberação explícita de memória.
- **Garbage Collector (GC):** A memória é gerenciada automaticamente pelo coletor de lixo. Quando um objeto deixa de ter qualquer variável apontando para ele (por exemplo, quando atribuímos **null** à sua última referência), ele se torna elegível para ser apagado da memória pelo GC.
