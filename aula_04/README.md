# Aula 04 - Laços de Repetição em Java 🔁

## 👩🏻‍💻 Projetos criados
- [Pesquisa.java](https://github.com/renatangr/Generation_Aulas/blob/main/aula_04/src/aula_04/Pesquisa.java)

    > Programa que realiza uma pesquisa com os usuários, utilizando laços de repetição para coletar e processar os dados

- [TabuadaDoWhile.java](https://github.com/renatangr/Generation_Aulas/blob/main/aula_04/src/aula_04/TabuadaDoWhile.java)
- [TabuadaFor.java](https://github.com/renatangr/Generation_Aulas/blob/main/aula_04/src/aula_04/TabuadaFor.java)
- [TabuadaWhile.java](https://github.com/renatangr/Generation_Aulas/blob/main/aula_04/src/aula_04/TabuadaWhile.java)

    > Programas que geram a tabuada de um número fornecido pelo usuário, utilizando diferentes estruturas de repetição.

## 👩🏻‍💻 Exercícios resolvidos

- [Exercício 1 - Do While](https://github.com/renatangr/Generation_Aulas/blob/main/aula_04/src/aula_04/Exercicio1_DoWhile.java)
    > Escreva um algoritmo que leia números inteiros via teclado, até que o número zero seja digitado. Ao final, mostre na tela a soma de todos os números digitados, que sejam positivos

- [Exercício 2 - Do While](https://github.com/renatangr/Generation_Aulas/blob/main/aula_04/src/aula_04/Exercicio2_DoWhile.java)
    > Escreva um algoritmo que leia números inteiros via teclado, até que o número zero seja digitado. Ao final, mostre na tela a média de todos os números digitados, que sejam múltiplos de 3

- [Exercício 1 - While](https://github.com/renatangr/Generation_Aulas/blob/main/aula_04/src/aula_04/Exercicio1_While.java)
    > Escreva um algoritmo que leia a idade de várias pessoas (números inteiros), via teclado e mostre na tela o total de pessoas cuja idade seja menor que 21 anos e o total de pessoas cuja idade seja maior que 50 anos. A leitura dos dados deve ser finalizada ao digitar uma idade negativa

- [Exercício 2 - While](https://github.com/renatangr/Generation_Aulas/blob/main/aula_04/src/aula_04/Exercicio2_While.java)
    > Uma empresa desenvolveu uma pesquisa interna para conhecer os colaboradores da área de Desenvolvimento e precisam de um sistema para analisar os dados. Escreva um algoritmo que leia via teclado as informações de cada colaborador e retorne os resultados da pesquisa

- [Exercício 1 - For](https://github.com/renatangr/Generation_Aulas/blob/main/aula_04/src/aula_04/Exercicio1_For.java)
    > Escreva um algoritmo que leia 2 números inteiros via teclado, onde o primeiro número deve ser menor do que o segundo número. Caso contrário, deve ser exibida uma mensagem na tela informando que o intervalo é inválido e sair do programa

- [Exercício 2 - For](https://github.com/renatangr/Generation_Aulas/blob/main/aula_04/src/aula_04/Exercicio2_For.java)
    > Escreva um algoritmo que leia 10 números inteiros via teclado e mostre na tela quantos números são pares e quantos número são ímpares

## Tipos de Laços

### `for`

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

> Ideal quando você já sabe o número de repetições (como contar de 1 a 10, percorrer um array com índice etc) e quando precisa acessar um índice específico.


### `for each`

```java
String[] nomes = {"Ana", "Bruno", "Carlos"};

for (String nome : nomes) {
    System.out.println(nome);
}
```
> Lê-se: "para cada `nome` em `nomes`"

**Quando usar for-each?**
- Quando você quer ler ou processar todos os itens de uma coleção.
- Quando não precisa modificar a coleção durante o loop.
- Quando não precisa saber o índice atual (se precisar, use for tradicional).

### `while`

```java
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}
```

> Quando você não sabe quantas vezes vai repetir, e quer testar a condição antes de executar. O código só entra no loop se a condição for verdadeira. Se for falsa desde o início, não executa nenhuma vez.

### `do...while`

```java
int i = 0;
do {
    System.out.println(i);
    i++;
} while (i < 5);
```

> Quando você quer garantir que o código execute pelo menos uma vez, mesmo que a condição seja falsa. A diferença é que a condição só é verificada depois da primeira execução. Então executa pelo menos uma vez.

</br>

## Debug no Eclipse

Acessar via:

```
Window → Perspective → Open Perspective → Debug
```

### Breakpoint

- Pausa a execução para análise no debug.

</br>

## Problema com `Scanner.nextLine()` após `nextInt()`

O problema: Scanner.nextLine() logo após nextInt() (ou nextDouble(), next() etc) pode pular a entrada de texto.

Por que esse problema ocorre? 

Este problema ocorre porque, quando o método nextInt() da classe Scanner é usado para ler um valor numérico, ele retorna o valor digitado para a variável como esperado e não consome os caracteres de quebra de linha e os demais, e o cursor, após ler o valor digitado, permanece logo após ele, por exemplo:

```
Digite uma idade: 18
```
> O cursor fica logo após o valor: 18<b>_</b> `->  Cursor fica aqui`

Assim, quando é usado o método nextLine() da classe Scanner após valores numéricos, este método inicia a leitura a partir da posição atual do cursor. Nesse caso, a leitura começará logo após o 1. Portanto, a próxima linha após o 1 é apenas uma nova linha, representada pelo caractere `\n`.

> [!NOTE]
> Curiosamente, o caractere de controle de quebra de linha é diferente para cada sistema operacional! O Linux tem a sequência de escape \n, o Mac tem \r, enquanto o Windows mantém \r\n, portanto, o ideal seria abranger todos os possíveis caracteres.

Use:
```java
scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
```

</br>

## Laços infinitos

```java
for (;;) { }     // for infinito
while (true) { } // while infinito
```
O `for (;;)` é uma forma de escrever um loop infinito em linguagens como C, C++, Java e JavaScript.
Você está omitindo os três componentes, ou seja:

- Não há inicialização
- Não há condição
- Não há incremento

Isso significa que o laço nunca vai parar por conta própria, então ele roda para sempre, a menos que você use algo como break dentro do loop para sair manualmente.

```java
for (;;) {
    printf("Isso vai rodar pra sempre!\n");
    // você pode usar um break em alguma condição, tipo:
    if (alguma_condicao) {
        break;
    }
}
```

Sendo equivalente a:

```java
while (true) {
    // código
    if (alguma_condicao) {
        break;
    }
}
```
</br>
