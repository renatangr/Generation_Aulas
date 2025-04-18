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

- [Exercício 1 - If](https://github.com/renatangr/Generation_Aulas/blob/main/aula_03/src/aula_03/Exercicio1_If.java)

    > Faça um algoritmo que leia 3 valores inteiros A, B e C e imprima na tela se a soma de A + B é maior, menor ou igual a C

- [Exercício 2 - If](https://github.com/renatangr/Generation_Aulas/blob/main/aula_03/src/aula_03/Exercicio2_If.java)

    > Escreva um algoritmo que leia um número inteiro via teclado e mostre na tela uma mensagem indicando se este número é par ou ímpar e se o número é positivo ou negativo

- [Exercício 3 - If](https://github.com/renatangr/Generation_Aulas/blob/main/aula_03/src/aula_03/Exercicio3_If.java)

    > Escreva um Algoritmo que obtenha via teclado o nome do doador, a idade do doador e se é a primeira doação. De acordo com as Regras para a doação, mostre na tela se o doador está Apto ou Não Apto para doar sangue

- [Exercício 4 - If](https://github.com/renatangr/Generation_Aulas/blob/main/aula_03/src/aula_03/Exercicio4_If.java)

    > Escreva um algoritmo que leia 3 palavras que definem as características de um tipo de animal e exiba o animal que combine com as características

- [Exercício 1 - Switch](https://github.com/renatangr/Generation_Aulas/blob/main/aula_03/src/aula_03/Exercicio1_Switch.java)

    > Escreva um algoritmo que leia o código de um item (número de 1 a 6) e a quantidade comprada deste item. A seguir, mostre na tela o valor total da conta e o nome do produto que foi comprado

- [Exercício 2 - Switch](https://github.com/renatangr/Generation_Aulas/blob/main/aula_03/src/aula_03/Exercicio2_Switch.java)

    > Escreva um algoritmo que leia o Nome do Colaborador, o Código do Cargo do Colaborador (número de 1 a 6) e o Salário. A seguir, mostre na tela o Nome do Colaborador, o Cargo e o novo Salário reajustado

- [Exercício 3 - Switch](https://github.com/renatangr/Generation_Aulas/blob/main/aula_03/src/aula_03/Exercicio3_Switch.java)

    > Escreva um algoritmo que simule uma Calculadora simples que funcione através de um menu com as operações de Soma, Subtração, Multiplicação e Divisão

- [Exercício 4 - Switch](https://github.com/renatangr/Generation_Aulas/blob/main/aula_03/src/aula_03/Exercicio4_Switch.java)

    > Desenvolva um algoritmo em Java para uma conta bancária. O programa deverá ler o tipo de operação a ser realizada com base em um menu e o valor a ser depositado ou sacado. Considere que um saque só pode ser realizado caso haja saldo suficiente. Ao final de cada operação, exiba o novo Saldo na tela. A variável saldo, será inicializada com o valor de R$ 1000.00. Caso a operação seja diferente do intervalo 1 a 3, mostre a mensagem Operação Inválida!

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