# Aula 01 - Introdução ao Ecossistema Java 🚀

## 👩🏻‍💻 Projetos criados
- [O `Hello, World` em Java para manter a tradição](https://github.com/renatangr/Generation_Aulas/blob/main/aula_01/src/helloworld/HelloWorld.java)

</br>

## 🧠 Tópicos abordados

### Para que o Java foi criado inicialmente
O Java foi criado com a proposta de ser uma linguagem portátil, orientada a objetos e segura, ideal para dispositivos embarcados. Com o tempo, evoluiu para atender também aplicações web, desktop, mobile e sistemas corporativos.

### Recursos do Java
- Portabilidade  
- Segurança  
- Multiplataforma  
- Ampla comunidade  
- Ferramentas robustas para desenvolvimento  

### Interpretada vs Compilada
- **Compilada**: O código é transformado diretamente em linguagem de máquina (ex: C, C++).
- **Interpretada**: O código é executado linha a linha por um interpretador (ex: Python).
- **Java** combina os dois: compila para *bytecode* (arquivo `.class`), que é interpretado pela **JVM**.

### Framework vs Biblioteca
- **Biblioteca**: Uma biblioteca é um conjunto de código pré-escrito que fornece funções e rotinas específicas para realizar tarefas comuns. As bibliotecas são geralmente modulares e os desenvolvedores as utilizam incorporando partes específicas de código em seus projetos conforme necessário. Elas oferecem funcionalidades específicas, mas não ditam uma estrutura ou fluxo geral para o aplicativo.
- **Framework**: Um framework é uma estrutura mais abrangente que define a arquitetura geral do software. Ele oferece uma base sobre a qual os desenvolvedores constroem seus aplicativos, ditando a estrutura e o fluxo de trabalho.
</br>

![ImagemFrameworkVsBiblioteca](/resources/frameworkvsbiblioteca.jpg)


### Programação Orientada a Objetos (POO)
POO é uma forma de representar o mundo real dentro do ambiente virtual. Trabalha com **objetos** que interagem entre si, com base em conceitos como:
- Classe  
- Objeto  
- Herança  
- Polimorfismo  
- Encapsulamento  

### Ecossistema Java

- **Java SE (Standard Edition)**: Para aplicações desktop e utilitários.
- **Java EE (Enterprise Edition)**: Focado em aplicações corporativas e servidores.
- **Java ME (Micro Edition)**: Para dispositivos móveis e embarcados.
- **Java FX**: Framework para desenvolvimento de interfaces gráficas modernas.


### Recursos e ferramentas da plataforma Java

| Ferramenta | Função |
|-----------|--------|
| **JDK** (Java Development Kit) | Conjunto de ferramentas de desenvolvimento (inclui compilador `javac`) |
| **JRE** (Java Runtime Environment) | Ambiente necessário para executar aplicações Java (inclui plugin para navegadores) |
| **JVM** (Java Virtual Machine) | Máquina virtual que interpreta o bytecode em tempo de execução |
| **Bytecode** | Código intermediário gerado após a compilação (arquivo `.class`) |
| **Garbage Collector** | Gerencia automaticamente a alocação e desalocação de memória |


### Etapas de execução de um código Java

```text
Código Java → Compilador (javac) → Bytecode (.class) → JVM → Execução Multiplataforma
```

### Arquivo JAR

- É o **build** final da aplicação  
- Contém todo o código e dependências  
- Necessário estar no servidor para execução de apps web  


### O que é `public static void main(String[] args)`

Esse é o **ponto de entrada** de qualquer aplicação Java. Quando você executa um programa, a JVM (Java Virtual Machine) procura por esse método para começar a execução.

### Quebrando a estrutura:
- `public`: o método pode ser acessado de qualquer lugar.
- `static`: o método pertence à classe, e não a uma instância (não precisa criar um objeto para chamá-lo).
- `void`: significa que o método **não retorna** nenhum valor.
- `main`: é o nome padrão que a JVM reconhece como início da aplicação.
- `String[] args`: parâmetro que permite passar **argumentos** pela linha de comando (por exemplo, `java MinhaClasse argumento1 argumento2`).

### Exemplo:
```java
public class MinhaClasse {
    public static void main(String[] args) {
        System.out.println("Olá, mundo!");
    }
}
```

### Commit semântico

Utilizamos emojis e palavras-chave para facilitar a identificação do tipo de mudança no projeto. Exemplos:

- `:tada: Commit inicial` — Primeiro commit do projeto