# Aula 07 - Estruturas de Dados em Java

Este diretório contém os exercícios da Aula 07 do curso Generation Brasil. O foco da aula foi o estudo das estruturas de dados lineares: pilhas (stack) e filas (queue), com implementações práticas utilizando a linguagem Java.

## 👩🏻‍💻 Projetos criados
- [fila.java](https://github.com/renatangr/Generation_Aulas/blob/main/aula_07/src/aula_07/fila.java)
    > Classe que representa a estrutura de uma fila (FIFO – First In, First Out). Utiliza os métodos da API Queue e LinkedList do Java para adicionar e remover elementos de forma ordenada.

- [pilha.java](https://github.com/renatangr/Generation_Aulas/blob/main/aula_07/src/aula_07/pilha.java)
    > Classe que representa a estrutura de uma pilha (LIFO – Last In, First Out), utilizando a classe Stack da biblioteca Java para manipular os dados.

## 👩🏻‍💻 Exercícios desenvolvidos
- [Exercicio_Fila.java](https://github.com/renatangr/Generation_Aulas/blob/main/aula_07/src/aula_07/Exercicio_Fila.java)
    > Exercício que utiliza a Collection Queue para simulação de um menu de manipulação de fila de atendimento

- [Exercicio_Pilha.java](https://github.com/renatangr/Generation_Aulas/blob/main/aula_07/src/aula_07/Exercicio_Pilha.java)
    > Exercício que utiliza a Collection Stack para simulação de um menu de manipulação de pilha de livros

## O que são Estruturas de Dados?

Estruturas de dados são formas de organizar e armazenar informações para que possam ser acessadas e processadas de maneira eficiente por um sistema.

---

## Classificações

### Estruturas Lineares
- **Estática**: 
  - `Array`
- **Dinâmica**: 
  - `LinkedList`, `Stack`, `Queue`

### Estruturas Não Lineares
- **Tree** (Árvore)
- **Graph** (Grafo)

---

## Estrutura de Fila (Queue - FIFO)

A interface `Queue` da Collection utiliza a implementação `LinkedList` para manter o controle de quem é o próximo e quem foi o anterior na fila.

### Métodos Comuns de `Queue`:
- `add()`: adiciona um elemento
- `size()`: retorna o tamanho
- `clear()`: limpa a fila
- `pop()`: remove o primeiro elemento
- `isEmpty()`: verifica se está vazia
- `contains()`: verifica se um valor existe na fila
- `peek()`: retorna o primeiro elemento sem remover
- `poll()`: retorna e remove o primeiro elemento

---

## Estrutura de Pilha (Stack - LIFO)

A interface `Stack` da Collection segue o padrão de **último a entrar, primeiro a sair** (LIFO).

### Métodos Comuns de `Stack`:
- `push()`: adiciona um elemento
- `size()`: retorna o tamanho
- `clear()`: limpa a pilha
- `remove()`: remove um elemento específico
- `isEmpty()`: verifica se está vazia
- `contains()`: verifica se um valor existe na pilha
- `peek()`: retorna o topo da pilha sem remover

