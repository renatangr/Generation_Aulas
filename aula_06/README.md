# Aula 06 - Coleções em Java
Este diretório contém os códigos desenvolvidos durante a sexta aula do curso Generation Brasil. O foco principal foi introduzir e praticar o uso das principais coleções da linguagem Java, como ArrayList e HashSet, por meio de exemplos e exercícios práticos.

## 👩🏻‍💻 Projetos criados
- [ColecaoArrayList.java](https://github.com/renatangr/Generation_Aulas/blob/main/aula_06/src/aula_06/ColecaoArrayList.java)
    > Demonstra o uso da classe ArrayList para armazenar e manipular uma lista de elementos

- [ColecaoSet.java](https://github.com/renatangr/Generation_Aulas/blob/main/aula_06/src/aula_06/ColecaoSet.java)
    > Apresenta a utilização da interface Set e suas implementações, como HashSet, para trabalhar com conjuntos de elementos únicos
 
## 👩🏻‍💻 Exercícios resolvidos
- [Exercício 1 - Collection List](https://github.com/renatangr/Generation_Aulas/blob/main/aula_06/src/aula_06/Exercicio1_List.java)
    > Escreva um algoritmo para criar uma Collection ArrayList de Objetos da Classe String. O programa deverá solicitar ao usuário, que ele digite via teclado 5 cores e deverá adicioná-las individualmente no ArrayList. Em seguida:
    > - Mostre na tela todas as cores que foram adicionadas. 
    > - Mostre na tela todas as cores que foram adicionadas ordenadas em ordem crescente.


- [Exercício 2 - Collection List](https://github.com/renatangr/Generation_Aulas/blob/main/aula_06/src/aula_06/Exercicio2_List.java)
    > Escreva um algoritmo para criar uma Collection ArrayList de Objetos da Classe Wrapper Integer, inicializada com 10 valores inteiros. O programa deverá solicitar ao usuário, que ele digite via teclado 1 número inteiro e caso ele seja encontrado no ArrayList, exiba na tela a posição deste número na Collection. Caso o número não seja encontrado, ele deverá exibir na tela a mensagem: O número NN não foi encontrado!

- [Exercício 1 - Collection Set](https://github.com/renatangr/Generation_Aulas/blob/main/aula_06/src/aula_06/Exercicio1_Set.java)
    > Escreva um programa Java para criar uma Collection Set de Objetos da Classe Wrapper Integer. O programa deverá solicitar ao usuário, que ele digite via teclado 10 valores inteiros não repetidos e adicione-os individualmente na Collection Set. Em seguida mostre na tela todos os elementos da Collection Set, utilizando a Classe Iterator. 


- [Exercício 2 - Collection Set](https://github.com/renatangr/Generation_Aulas/blob/main/aula_06/src/aula_06/Exercicio2_Set.java)
    > Escreva um programa Java para criar uma Collection Set de Objetos da Classe Wrapper Integer, inicializada com 10 valores inteiros. O programa deverá solicitar ao usuário, que ele digite via teclado 1 número inteiro e caso ele seja encontrado no Set, exiba na tela a mensagem: Número 00 Encontrado! Caso o número não seja encontrado, ele deverá exibir na tela a mensagem: O número NN não foi encontrado!



## Limitações de Arrays

- Têm **tamanho fixo**, definido no momento da instanciação.
- Acesso por **índice** é necessário para manipular os elementos.
- Não oferecem muita flexibilidade para operações como inserção dinâmica ou ordenação.

---

## Coleções em Java

As **Coleções** são uma evolução das estruturas de dados como vetores e matrizes. Elas pertencem ao pacote `java.util.*` e oferecem maior flexibilidade e funcionalidades.

### Classe `Collections`

- Implementa várias estruturas de dados clássicas.
- Otimiza o **armazenamento**, a **organização** e o **acesso** a dados.

### Ponteiros

- Ponteiros indicam onde um dado está armazenado na memória.
- Em Java, a manipulação direta de ponteiros não é permitida como em C/C++, mas **referências de objetos funcionam como ponteiros**.

> As collections usam **matrizes internamente**, mas escondem a complexidade da alocação de memória dinâmica.

---

## Vantagens do uso de Collections

- Eficiência no acesso, busca e inserção de dados.
- Organização lógica e eficiente dos dados.
- Abstração da complexidade de crescimento e gerenciamento de tamanho.

---

## Estrutura da API Collections (`java.util.*`)

### Interface `List`
- Implementações: `ArrayList`, `Vector`, `LinkedList`, `Stack`
- Permite **elementos duplicados**, mantém ordem de inserção

### Interface `Queue` (Fila - FIFO)
- Implementações: `Deque`, `PriorityQueue`, `ArrayDeque`
- FIFO (First In, First Out)
- `PriorityQueue`: organiza por **prioridade**
- `Deque`: permite inserção/remoção no início e fim (FIFO + LIFO)

### Interface `Set`
- Implementações: `HashSet`, `SortedSet`, `TreeSet`, `LinkedHashSet`, `NavigableSet`
- Não permite **valores duplicados**
- Não utiliza índices
- Pode ser convertido para `ArrayList` se necessário

### Interface `Stack` (Pilha - LIFO)
- Last In, First Out

### Interface `Iterator`
- Percorre elementos de forma sequencial

### Interface `Tree`
- Utiliza estrutura de **Árvore Binária**

### Interface `Map`
- Estrutura de **pares chave-valor** (`HashMap`, `TreeMap`, etc.)