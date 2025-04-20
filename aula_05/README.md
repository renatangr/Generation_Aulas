# Aula 05 - Vetores e Matrizes
Este diretório contém os códigos desenvolvidos durante a quinta aula do curso Generation Brasil. O foco principal foi introduzir e praticar o uso de vetores (arrays unidimensionais) e matrizes (arrays bidimensionais) em Java, por meio de exercícios práticos.

## 👩🏻‍💻 Projetos criados
- [Cinema.java](https://github.com/renatangr/Generation_Aulas/blob/main/aula_05/src/aula_05/Cinema.java​)
    > Simula o sistema de reservas de assentos em um cinema, utilizando matrizes para representar a disposição dos assentos

- [Vetores.java](https://github.com/renatangr/Generation_Aulas/blob/main/aula_05/src/aula_05/Vetores.java)
    > Demonstrações e exemplos básicos sobre a declaração, inicialização e uso de vetores em Java

- [Matrizes.java](https://github.com/renatangr/Generation_Aulas/blob/main/aula_05/src/aula_05/Matrizes.java)
    > Demonstrações e exemplos básicos sobre a declaração, inicialização e uso de matrizes em Java


## 👩🏻‍💻 Exercícios resolvidos
- [Exercício 1 - Vetores](https://github.com/renatangr/Generation_Aulas/blob/main/aula_05/src/aula_05/Exercicio1_Vetores.java)
    > Dado um vetor contendo 10 números inteiros não ordenados e não repetidos, construa um algoritmo que consiga pesquisar dados no vetor, onde o usuário irá digitar um número e o programa deve exibir na tela a posição deste número no vetor. Caso o número não seja encontrado, a mensagem: “Não foi encontrado!” deve ser exibida na tela

- [Exercício 2 - Vetores](https://github.com/renatangr/Generation_Aulas/blob/main/aula_05/src/aula_05/Exercicio2_Vetores.java)
    > Elabore um algoritmo que leia 10 números inteiros e armazene em um vetor. Em seguida, mostre na tela: 
    > - Todos os elementos ímpares do vetor 
    > - Todos os elementos pares do vetor
    > - A Soma de todos os elementos do vetor
    > - A Média de todos os elementos do vetor



- [Exercício 1 - Matrizes](https://github.com/renatangr/Generation_Aulas/blob/main/aula_05/src/aula_05/Exercicio1_Matrizes.java)
    > Elabore um algoritmo que leia uma Matriz 3x3 de números inteiros e em seguida, mostre na tela:
    > - Todos os elementos da Diagonal Principal
    > - Todos os elementos da Diagonal Secundária
    > - A Soma de todos os elementos da Diagonal Principal
    > - A Soma de todos os elementos da Diagonal Secundária


- [Exercício 2 - Matrizes](https://github.com/renatangr/Generation_Aulas/blob/main/aula_05/src/aula_05/Exercicio2_Matrizes.java)
    > Elabore um algoritmo que leia as notas de uma classe com 10 participantes durante 4 bimestres de um ano. As 4 notas de cada participante serão armazenadas em uma linha de uma matriz de números reais, logo cada linha da matriz serão as notas de um participante. Em um vetor de números reais, armazene as médias de cada participante e exiba as médias de cada um na tela

## Arrays em Java

Arrays são estruturas que armazenam **coleções de elementos do mesmo tipo**.

---

## Tipos de Arrays

### Unidimensional (Vetores)

```java
int[] numeros = {1, 2, 3, 4};
```

### Bidimensional (Matriz)

```java
int[][] matriz = {
  {1, 2},
  {3, 4}
};
```

### Multidimensional

```java
int[][][] cubo = new int[2][2][2];
```

> 🧩 Existem **matrizes regulares** (todas as linhas com mesmo tamanho) e **matrizes irregulares**.

---

## Propriedade `.length`

- `vetor.length` retorna o tamanho do vetor.
- **Atenção**: é uma **propriedade**, não um método (não usa parênteses).

---

## Laços com Arrays

### For Each (com tipo explícito)

```java
for (float valor : vetorReal) {
    System.out.println(valor);
}
```

### For Each com `var` (tipo inferido)

```java
for (var valor : vetorReal) {
    System.out.println(valor);
}
```

> For each **não fornece o índice** dos elementos. Para isso, use `for` tradicional.

---

## Métodos da Classe `Arrays`

```java
import java.util.Arrays;
import java.util.Collections;

Arrays.sort(vetor);                 // Ordena
Arrays.equals(v1, v2);              // Compara arrays
Arrays.binarySearch(vetor, valor);  // Busca binária
Arrays.fill(vetor, valor);          // Preenche com valor
Arrays.compare(v1, v2);             // Compara lexicograficamente
Collections.reverseOrder();         // Inverte ordem (requer objetos, não tipos primitivos)
```

---

## Tipos Primitivos vs Wrappers

- `float` → tipo primitivo
- `Float` → classe objeto (wrapper)

```java
float numero = 5.5f;
Float numeroObjeto = 5.5f;
```

> Classes Wrapper (como `Float`, `Integer`, `Boolean`) oferecem **métodos utilitários** e são necessárias em estruturas como `Collections`.

---

## Conceito Importante

> **Wrappers**: classes equivalentes aos tipos primitivos que encapsulam valores e fornecem funcionalidades adicionais.