# Aula 1: Fundamentos da Tecnologia Java e Arquitetura

## 1. O que é o Java?
Java é uma linguagem de programação orientada a objetos desenvolvida originalmente pela Sun Microsystems (hoje mantida pela Oracle). 

O grande lema do Java é:
> **WORA: "Write Once, Run Anywhere"** (Escreva uma vez, execute em qualquer lugar).

Isso significa que um programa Java escrito no Windows pode rodar no macOS, Linux ou em um servidor na nuvem sem precisar ser reescrito ou recompilado para cada sistema operacional.

---

## 2. A Tríade da Arquitetura: JDK, JRE e JVM

Entender a diferença entre essas três siglas é essencial para qualquer desenvolvedor Java:

```text
┌────────────────────────────────────────────────────────┐
│ JDK (Java Development Kit)                             │
│  - Compilador (javac)                                  │
│  - Ferramentas de desenvolvimento (javadoc, jdb, jar)  │
│                                                        │
│  ┌──────────────────────────────────────────────────┐  │
│  │ JRE (Java Runtime Environment)                   │  │
│  │  - Bibliotecas da API Java (java.util, etc.)     │  │
│  │                                                  │  │
│  │  ┌────────────────────────────────────────────┐  │  │
│  │  │ JVM (Java Virtual Machine)                 │  │  │
│  │  │  - Executa o Bytecode (.class)             │  │  │
│  │  │  - Gerenciamento de memória e Garbage Coll.│  │  │
│  │  └────────────────────────────────────────────┘  │  │
│  └──────────────────────────────────────────────────┘  │
└────────────────────────────────────────────────────────┘
```

### **JVM (Java Virtual Machine)**
- É o motor de execução.
- Ela não entende o código `.java` que você digita; ela entende o **Bytecode** (arquivo `.class`).
- Cada sistema operacional tem a sua própria JVM específica instalada, o que garante a portabilidade do mesmo arquivo `.class` entre diferentes plataformas.

### **JRE (Java Runtime Environment)**
- É o ambiente de execução voltado para o usuário final.
- Contém a JVM + bibliotecas padrão necessárias para executar os programas.

### **JDK (Java Development Kit)**
- É o kit completo para quem **desenvolve**.
- Inclui a JRE + compilador `javac` + ferramentas de depuração e empacotamento.
- **Importante:** Como programadores, nós sempre instalamos a **JDK** na nossa máquina.

---

## 3. O Ciclo de Vida do Código Java

```text
SeuCódigo.java  ──(compilador javac)──>  SeuCódigo.class (Bytecode)  ──(JVM)──>  Código de Máquina (CPU)
```
1. Você escreve o código fonte em um arquivo com extensão `.java`.
2. O compilador `javac` valida a sintaxe e transforma em **Bytecode** (arquivo `.class`).
3. A **JVM** carrega o bytecode, traduz em tempo de execução (usando compilador JIT - Just-In-Time) para a linguagem nativa do processador da sua máquina e executa o programa.
