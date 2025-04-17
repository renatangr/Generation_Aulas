# Aula 03 - Operadores Relacionais e Laços Condicionais 

Nesta aula foram estudadas estruturas condicionais e operadores que permitem a tomada de decisões dentro do programa.

</br>

## 👩🏻‍💻 Projetos criados
- [Caracteres.java](https://github.com/renatangr/Generation_Aulas/blob/main/aula_03/src/aula_03/Caracteres.java)
    > Demonstra o uso de caracteres e suas manipulações em Java.

- [ConversorMoedas.java](https://github.com/renatangr/Generation_Aulas/blob/main/aula_03/src/aula_03/ConversorMoedas.java)

    > Implementa um conversor de moedas, permitindo a conversão entre diferentes tipos de moedas

- [Notas.java](https://github.com/renatangr/Generation_Aulas/blob/main/aula_03/src/aula_03/Notas.java)

    > Calcula e avalia notas de alunos, determinando conceitos ou situações acadêmicas

- [OperadoresLogicos.java](https://github.com/renatangr/Generation_Aulas/blob/main/aula_03/src/aula_03/OperadoresLogicos.java)

    > Explora o uso de operadores lógicos (&&, ||, !) em expressões condicionais

</br>

## 👩🏻‍💻 Exercícios resolvidos

> Em construção ...


</br>

## 🧠 Tópicos abordados

### Operadores Relacionais

Permitem comparar dois valores. O resultado sempre será **verdadeiro (`true`)** ou **falso (`false`)**.

- `==` → igual a  
- `!=` → diferente de  
- `>` → maior que  
- `<` → menor que  
- `>=` → maior ou igual a  
- `<=` → menor ou igual a  

Esses operadores geralmente são usados em estruturas condicionais.

</br>

## Estruturas Condicionais

### `if` Simples

Executa um bloco de código **somente se** a condição for verdadeira.

```java
if (idade >= 18) {
    System.out.println("Maior de idade.");
}
```
### `if` Composto (`if...else`)

Permite executar um segundo bloco de código caso a condição seja falsa.

```java
if (idade >= 18) {
    System.out.println("Maior de idade.");
} else {
    System.out.println("Menor de idade.");
}
```
### Operador Ternário
Sintaxe compacta para uma verificação `if...else` simples.
```java
String status = (idade >= 18) ? "Maior de idade" : "Menor de idade";
```

### Uso sem chaves {}
Se o bloco tiver apenas uma linha, as chaves são opcionais.

```java
if (idade >= 18)
    System.out.println("Maior de idade");
```

### Switch Case
Estrutura condicional usada para múltiplas escolhas. Alternativa ao `if...else if...else`.

```java
switch (dia) {
    case 1:
        System.out.println("Domingo");
        break;
    case 2:
        System.out.println("Segunda-feira");
        break;
    default:
        System.out.println("Dia inválido");
}
```
- `default` → executado se nenhum `case` corresponder
- `return` → finaliza a execução de um método ou do programa
- `break` → finaliza a execução de um laço (`for`, `while`, `switch` etc.)