# Aula 3: Escolha e Configuração da IDE

## 1. O que é uma IDE?
Uma **IDE (Integrated Development Environment)** reúne em uma única interface:
* Editor de código com destaque de sintaxe e autocompletar inteligente (*IntelliSense*);
* Compilador e executor integrados (com botão "Play");
* Depurador (*debugger*) com pontos de interrupção (*breakpoints*);
* Controle de versão (Git) integrado.

---

## 2. As Principais IDEs para Java no Mercado

1. **IntelliJ IDEA (JetBrains) - Recomendação da DIO e do Mercado:**
   * A versão **Community Edition** é gratuita e atende perfeitamente a todos os fundamentos, POO e desafios de código.
   * Recursos fantásticos de refatoração, navegação de classes e atalhos rápidos.
2. **VS Code (Visual Studio Code):**
   * Leve e versátil, muito usado com o *Extension Pack for Java* da Microsoft.
3. **Eclipse:**
   * Uma das IDEs mais tradicionais do mercado corporativo e de sistemas legados.

---

## 3. Primeiros Passos no IntelliJ IDEA

1. **Baixar:** Acesse [jetbrains.com/idea](https://www.jetbrains.com/idea/download/) e baixe a versão **Community**.
2. **Configurar o SDK do Projeto:**
   * Ao abrir a IDE pela primeira vez, vá em **New Project**.
   * No campo **JDK**, aponte para a versão instalada no seu sistema (ou selecione *Download JDK* diretamente pela IDE).
3. **Atalhos Essenciais para Produtividade:**
   * `psvm` + `Tab` ou `Enter`: Gera automaticamente o método `public static void main(String[] args)`.
   * `sout` + `Tab` ou `Enter`: Gera o comando de saída `System.out.println()`.
   * `Ctrl + Shift + F10` (Windows/Linux) ou `Control + Shift + R` (macOS): Executa o arquivo atual.
   * `Ctrl + /` (Windows/Linux) ou `Cmd + /` (macOS): Comenta/descomenta a linha selecionada.
