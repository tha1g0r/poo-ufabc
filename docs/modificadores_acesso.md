# Modificadores de Acesso

## Resumo de Visibilidade

A tabela abaixo resume graficamente de onde cada modificador permite o acesso:

| Modificador            | Própria Classe | Mesmo Pacote | Subclasse (Outro Pacote) | Global (Qualquer lugar) | Símbolo UML |
| ---------------------- | -------------- | ------------ | ------------------------ | ----------------------- | ----------- |
| `public`               | Sim            | Sim          | Sim                      | Sim                     | `+`         |
| `protected`            | Sim            | Sim          | Sim                      | Não                     | `#`         |
| ***default* (nenhum)** | Sim            | Sim          | Não                      | Não                     | `~`         |
| `private`              | Sim            | Não          | Não                      | Não                     | `-`         |
