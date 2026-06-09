# O que é uma Exceção?

Uma exceção é um evento excepcional que **quebra o fluxo normal de um programa**. Ela é muito utilizada para lidar com erros, ajudando a separar o tratamento desses problemas do código principal.

Aqui estão dois exemplos clássicos de exceções que acontecem em Java quando algo dá errado:

- `NullPointerException`: Ocorre ao tentar usar uma variável de objeto que está vazia (`null`), como chamar `p2.imprimirProva()` quando `p2` não aponta para nenhuma prova.

- `ArrayIndexOutOfBoundsException`: Ocorre ao tentar acessar uma posição inválida de um vetor, como buscar o índice `5` em um vetor que só vai de `0` a `4`.

Quando uma exceção dessas acontece e não fazemos nada, o programa **para de funcionar imediatamente** e as linhas seguintes de código nem chegam a ser executadas.
