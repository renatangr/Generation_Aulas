# Aula 08 - Métodos em Java

## 👩🏻‍💻 Projetos desenvolvidos
[CalculadoraMetodos.java](https://github.com/renatangr/Generation_Aulas/blob/main/aula_08/src/aula_08/CalculadoraMetodos.java)

> Este arquivo define uma classe chamada CalculadoraMetodos que implementa métodos básicos de uma calculadora: soma, subtração, multiplicação e divisão. Cada operação é encapsulada em um método separado que recebe dois números como parâmetros e retorna o resultado da operação. É uma introdução prática à criação e uso de métodos em Java, reforçando a importância da modularização do código para reutilização e organização.

## O que é um Método?

Um **método** é uma função associada a uma classe. Ele representa uma ação ou um comportamento do objeto.

- **Funções e métodos** são nomeados com **verbos**.
- Permitem modularizar o programa, tornando os códigos reutilizáveis e evitando repetições desnecessárias.
- Cada método deve ser **assertivo**, ou seja, fazer apenas o que se propõe (ex: `pagarFatura()` deve apenas pagar a fatura, e não misturar várias lógicas diferentes).

---

## Modificadores de Métodos

### Modificadores de Acesso:
- `Default`: visível apenas no mesmo pacote.
- `public`: visível para todos.
- `protected`: visível para classes do mesmo pacote e subclasses.
- `private`: visível apenas dentro da própria classe.

### Modificadores Non-Access:
- `static`: pertence à classe, não a instâncias.
- `final`: não pode ser sobrescrito.
- `abstract`: declarado sem implementação.
- `synchronized`: controla o acesso concorrente (threads).
- `volatile`, `transient`, `native`: usados em casos especiais (como controle de memória e chamadas nativas).

---

## Tipo de Retorno do Método

O tipo de dado que o método vai retornar:
- `boolean`, `int`, `short`, `double`, `String`, entre outros.
- Caso não retorne nada, usa-se `void`.

---

## Regras para Nomeação de Métodos

- Utilizar **camelCase**.
- Começar com letra minúscula.
- Nome deve ser claro e representativo.
- Utilizar verbos no infinitivo (ex: `calcularSalario`, `enviarEmail`).
- Evitar abreviações.

---

## Argumentos e Parâmetros

**Argumentos** são variáveis passadas ao método no momento de sua chamada.
**Parâmetros** são variáveis definidas na assinatura do método.

Exemplo:

```java
public int soma(int a, int b) {
    return a + b;
}
```

- `a` e `b` são parâmetros.
- Quando chamamos `soma(3, 5)`, `3` e `5` são argumentos.

---
