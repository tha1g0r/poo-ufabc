# Cópia de Objetos

Três tópicos principais:

1. O método `clone()` e a interface `Cloneable`.
2. A diferença entre **cópia rasa** (*shallow copy*) e **cópia profunda** (*deep copy*).
3. O **construtor de cópia** (uma alternativa muito útil ao `clone()`).

## O Método `clone()`

No Java, o método `clone()` pertence à classe base `Object` e serve justamente para retornar uma cópia de um objeto. Para que o programa não lance a exceção `CloneNotSupportedException`, a sua classe precisa obrigatoriamente implementar a interface `Cloneable`.

Na prática, o método `clone()` é sobrescrito na própria classe chamando internamente `super.clone()`, que é quem fará a cópia.

`super.clone()` faz, por padrão, o que chamamos de **cópia rasa**.

## Cópia Rasa vs. Cópia Profunda

Na **cópia rasa**, copiamos apenas os valores dos atributos do objeto. Para tipos primitivos, o valor é copiado normalmente, mas para atributos que são objetos, apenas a referência é copiada. Isso significa que o objeto original e a cópia acabarão apontando para o mesmo objeto interno na memória.

Já na **cópia profunda**, nós criamos uma cópia completa do objeto principal e também duplicamos todos os objetos referenciados dentro dele. Assim, os dois objetos ficam totalmente independentes e a alteração em um não afeta o outro.

### Cópia Profunda

Para fazer uma cópia profunda de um objeto com muitos atributos, você precisará copiar cada objeto interno manualmente, seja usando o método `clone()` ou um **construtor de cópia**.

Se optar pelo `clone()`, é preciso chamar `super.clone()` e, logo depois, chamar o `.clone()` individualmente para cada atributo mutável da sua classe.

A alternativa mais recomendada e limpa é usar o **construtor de cópia**, que é um construtor que recebe uma instância da própria classe como parâmetro e copia explicitamente os valores de cada atributo. Ele é vantajoso porque evita as exigências do `clone()`, como implementar a interface `Cloneable` e tratar exceções específicas.

## Construtor de Cópia

Nesse padrão, o construtor recebe como argumento uma instância da própria classe e copia seus atributos para o novo objeto:

```Java
public class Alternativa {
    private String descricao;

    // Construtor de cópia
    public Alternativa(Alternativa a) {
        this.descricao = new String(a.descricao);
    }
}
```
