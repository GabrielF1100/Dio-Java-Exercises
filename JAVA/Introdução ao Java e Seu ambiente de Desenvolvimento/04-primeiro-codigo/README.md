# Aula 4: Códigos Práticos do Módulo

Esta pasta contém todos os códigos desenvolvidos e explicados nas aulas práticas do módulo de Introdução e Ambiente Java.

---

## 📂 Arquivos Disponíveis em `src/`

| Arquivo | Conceito Demonstrado |
| :--- | :--- |
| **`HelloWorld.java`** | O primeiro programa clássico, estrutura mínima da classe e o método `main`. |
| **`AnatomiaClasse.java`** | Padrões de nomenclatura (CamelCase), declaração de variáveis e criação de métodos auxiliares. |
| **`ArgumentosMain.java`** | Como receber e processar parâmetros via linha de comando (`String[] args`). |
| **`EntradaDadosScanner.java`** | Interação com o usuário lendo dados do teclado com a classe `Scanner`. |
| **`OperadoresBasicos.java`** | Operações aritméticas básicas (`+`, `-`, `*`, `/`, `%`), casting e formatação com `printf`. |

---

## 🚀 Como compilar e executar todos pelo Terminal

Navegue até a pasta `src`:
```bash
cd "/Users/gabrielfelippebaptista/Downloads/BOOTCAMP/JAVA/Introdução ao Java e Seu ambiente de Desenvolvimento/04-primeiro-codigo/src"
```

### 1. Compilar todos de uma vez:
```bash
javac *.java
```

### 2. Executar individualmente:
```bash
# 1. Hello World
java HelloWorld

# 2. Anatomia de uma Classe
java AnatomiaClasse

# 3. Argumentos da Linha de Comando (passe valores no final)
java ArgumentosMain Gabriel 25 Dev

# 4. Entrada com Scanner (interativo via teclado)
java EntradaDadosScanner

# 5. Operadores Básicos
java OperadoresBasicos
```

---

## 🖥️ Como rodar na sua IDE (IntelliJ IDEA ou Eclipse)

1. Abra a pasta do curso no **IntelliJ** ou importe no **Eclipse**.
2. Abra qualquer um dos arquivos `.java` na pasta `src/`.
3. Clique com o botão direito no arquivo ou na setinha verde ao lado do `main` e selecione **Run**!
