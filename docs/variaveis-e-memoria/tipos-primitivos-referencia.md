# Tipos Primitivos e Tipos de Referência

| Característica | Tipos Primitivos | Tipos de Referência |
| --- | --- | --- |
| **O que armazenam** | O valor bruto diretamente na variável. | O endereço de memória (ponteiro) onde o objeto real está localizado. |
| **Local na Memória** | Geralmente ficam no local de execução rápida (Stack). | O endereço fica na Stack, mas o objeto real fica em uma área maior (Heap). |
| **Exemplos** | `int`, `boolean`, `double`, `char`, `byte`, `short`, `long`, `float`. | Classes (`String` incluso), Vetores (`int[]`), Interfaces. |
| **Valor Padrão** | `0`, `0.0`, `false`, (nunca podem ser `null`). | `null`(quando não apontam para nenhum objeto). |
| **Comportamento no Clone** | O valor numérico/lógico é copiado diretamente. | Apenas o endereço é copiado por padrão (exige clonagem manual para cópia profunda). |
