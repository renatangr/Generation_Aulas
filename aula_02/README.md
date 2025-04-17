# Aula 02 - Aula 02 - Variáveis, Tipos e Operadores em Java 

Nesta aula foram abordados os fundamentos de variáveis, tipos de dados e operadores em Java, além de práticas de entrada/saída e boas práticas de nomeação

## 👩🏻‍💻 Projetos criados
- [Calculadora.java​](https://github.com/renatangr/Generation_Aulas/blob/main/aula_02/src/aula_02/Calculadora.java)
    > Implementa uma calculadora simples que realiza operações básicas como adição, subtração, multiplicação e divisão

- [OperadoresUnarios.java​](https://github.com/renatangr/Generation_Aulas/blob/main/aula_02/src/aula_02/OperadoresUnarios.java)

    > Demonstra o uso de operadores unários em Java, como incremento e decremento

- [Soma.java​](https://github.com/renatangr/Generation_Aulas/blob/main/aula_02/src/aula_02/Soma.java)

    > Exemplo simples que realiza a soma de dois números fornecidos pelo usuário

- [Variaveis.java](https://github.com/renatangr/Generation_Aulas/blob/main/aula_02/src/aula_02/Variaveis.java)

    > Explora a declaração e inicialização de variáveis de diferentes tipos em Java


## 👩🏻‍💻 Exercícios resolvidos
- [Exercício 1](https://github.com/renatangr/Generation_Aulas/blob/main/aula_02/src/aula_02/Exercicio1.java)

    > Recebe o salário e o abono, soma e mostra o resultado

- [Exercício 2](https://github.com/renatangr/Generation_Aulas/blob/main/aula_02/src/aula_02/Exercicio2.java)

    > Elabore um algoritmo que leia 4 notas de um participante e mostre a média

- [Exercício 3](https://github.com/renatangr/Generation_Aulas/blob/main/aula_02/src/aula_02/Exercicio3.java)

    > Elabore um algoritmo que leia o Salário Bruto, o Adicional Noturno, as Horas Extras e os Descontos de um Colaborador e exiba na tela o Salário Líquido

- [Exercício 4](https://github.com/renatangr/Generation_Aulas/blob/main/aula_02/src/aula_02/Exercicio4.java)

    > Leia quatro valores float (n1, n2, n3, n4). A seguir, calcule e mostre a diferença do produto entre o n1 e n2 pelo produto entre o n3 e o n4


</br>

## 🧠 Tópicos abordados

### Variáveis em Java

- São espaços na memória usados para armazenar valores durante a execução do programa.
- Devem ser declaradas com um **tipo de dado**.

#### Tipos Primitivos e Não Primitivos

- **Primitivos:** armazenam diretamente o valor.
  - `byte`, `short`, `int`, `long` (inteiros)
  - `float`, `double` (reais)
  - `char`, `boolean`
- **Não Primitivos:** armazenam referências de objetos.
  - Ex: `String`, `Scanner`, arrays e classes personalizadas

> ⚠️ A `String` é um tipo **objeto**, não é primitiva.

#### Tipos Numéricos

- Inteiros:
  - `byte` (8 bits)
  - `short` (16 bits)
  - `int` (32 bits)
  - `long` (64 bits) → usado, por exemplo, como **índice de tabelas em banco de dados**
- Reais:
  - `float` (32 bits, precisão simples)
  - `double` (64 bits, precisão dupla)

</br></br>

### Convenções de Nomeação

- **CamelCase:** usado para nomear variáveis e métodos → `minhaVariavel`
- **Classe:** começa com **letra maiúscula** → `MinhaClasse`
- **Constantes:** todas em **maiúsculo** com `_` → `PI`, `TAXA_MEDIA_ANUAL`

</br></br>

### E/S: Entrada e Saída de Dados

#### Saída de Dados
- `System.out.println()` → imprime e quebra linha
- `System.out.print()` → imprime na mesma linha
- `System.out.printf()` → formata valores com especificadores
  - Ex: `%.2f` para duas casas decimais

#### Caractere de Escape
Usado para inserir caracteres especiais em strings:
- Caractere de Escape: `\` → barra invertida
- Exemplo de uso: `\"` → para inserir aspas duplas em uma String


#### Entrada de Dados
- Usamos a **classe `Scanner`** do pacote `java.util`

```java
import java.util.Scanner;
Scanner leia = new Scanner(System.in);
String nome = leia.nextLine();
int idade = leia.nextInt();
```
</br></br>

## Operadores

### Aritméticos
- Soma `+`, Subtração `-`, Multiplicação `*`, Divisão `/`, Módulo `%`

### Lógicos
- `&&` (E), `||` (OU), `!` (NÃO)

### Unários
- `++`, `--`, `+`, `-`, `!`

### Pré e Pós Incremento/Decremento

- **Pré:** incrementa antes de usar o valor  
  - `++x`, `--x`
- **Pós:** usa o valor e depois incrementa  
  - `x++`, `x--`