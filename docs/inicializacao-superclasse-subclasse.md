# Declaração e Inicialização com Superclasse e Subclasse

## Cenário de Exemplo

Para ilustrar, imagine a seguinte estrutura básica:

```Java
public class Pai {
    public void metodoPai() { System.out.println("Método do Pai"); }
    public void fazerSom() { System.out.println("Som do Pai"); }
}

public class Filho extends Pai {
    public void metodoFilho() { System.out.println("Método exclusivo do Filho"); }
    @Override
    public void fazerSom() { System.out.println("Som do Filho"); } // Sobrescrita
}
```

## As 4 Combinações Possíveis de Inicialização

### 1. `Pai obj = new Pai();` (Referência `Pai`, Instância `Pai`)

Você cria um objeto puramente da classe base.

- **O que acontece:** O ponteiro na memória aponta para uma instância legítima de `Pai`.
- **Utilidade:** Usado quando você só precisa das regras de negócio gerais da classe mãe e não há necessidade de nenhuma especialização trazida por subclasse.
- **Acesso:** Tem acesso apenas aos atributos e métodos definidos na classe `Pai`.
- **Limitação:** Não conhece absolutamente nada do que foi criado dentro da classe `Filho`;

### 2. `Filho obj = new Filho();` (Referência `Filho`, Instância `Filho`)

Você cria um objeto explicitamente focado na subclasse.

- **O que acontece:** O objeto real na memória é um `Filho` e a variável que o controle também é do tipo `Filho`.
- **Utilidade:** Usado quando você está trabalhando em um contexto local específico e precisa obrigatoriamente acessar métodos exclusivos da subclasse (ex: `obj.metodoFilho()`).
- **Acesso:** Tem acesso total. Acessa tanto o que foi herdado de `Pai` quanto o que é exclusivo de `Filho`.

### 3. `Pai obj = new Filho();` (Referência `Pai`, Instância `Filho`) — *A essência do Polimorfismo*

Esta é a combinação polimórfica (também chamada de *Upcasting*).

- **O que acontece:** O objeto real criado na memória do computador é do tipo `Filho`, mas a variável de referência (o "controle remoto") é do tipo `Pai`.
- **Utilidade Principal: *Código Genérico e Desacoplado***. Permite criar estruturas extensíveis. Por exemplo, você pode criar um vetor ou lista `Pai` contendo vários tipos de filhos misturados (`Filho`, `Filho2`, `Filho3`).
  - **Polimorfismo Dinâmico:** Ao chamar `obj.fazerSom()`, o Java resolve isso em tempo de execução (*runtime*) olhando para a memória. Como o objeto real é uma `Filho`, ele executará a versão sobrescrita (`"Som do Filho"`).
- **Limitação:** O compilador limita o seu acesso visual ao tipo de referência. Portanto, você **não consegue** chamar `obj.metodoFilho()` diretamente, porque a variável é do tipo `Pai`. Para fazer isso, precisará realizar um *Downcasting*:

```Java
if (obj instanceof Filho) {
    Filho f = (Filho) obj;
    f.metodoFilho();
} // Agora funciona!
```

### 4. `Filho obj = new Pai();` — *Inválido / Erro de Compilação*

Essa combinação **não é permitida** pelo Java.

- **Por que não funciona?** Pense na regra da herança: *"Todo Filho é um Pai, mas nem todo Pai é um Filho"*. O compilador não pode garantir que um objeto puramente `Pai` possua as estruturas e métodos específicos que a variável do tipo `Filho` espera gerenciar.
- Se você tentar forçar isso usando um cast direto (`Filho obj = (Filho) new Pai();`), o código até compilará, mas jogará uma exceção de erro em tempo de execução (`ClassCastException`), travando o programa.

### Resumo Visual das Utilidades

| Combinação | Código Compila? | Qual método `fazerSom()` executa? | Pode chamar `metodoFilho()` diretamente? | Principal caso de uso |
| --- | --- | --- | --- | --- |
| `Pai obj = new Pai();` | Sim | Versão do **Pai** | Não | Usar o comportamento padrão da superclasse. |
| `Filho obj = new Filho();` | Sim | Versão do **Filho** | **Sim** | Quando necessita-se das funções exclusivas do filho. |
| `Pai obj = new Filho();` | Sim | Versão do **Filho** | Não (requer cast) | Criação de listas genéricas, APIs flexíveis e uso de polimorfismo. |
| `Filho obj = new Pai();` | **Não** | — | — | Proibido. Causa erro de compilação. |
