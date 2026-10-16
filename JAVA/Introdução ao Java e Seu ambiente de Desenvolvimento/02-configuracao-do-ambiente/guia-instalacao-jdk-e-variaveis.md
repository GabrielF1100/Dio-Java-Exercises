# Aula 2: Configuração do Ambiente e Instalação da JDK

## 1. Escolhendo a Versão da JDK

No mercado corporativo, priorizamos as versões **LTS (Long Term Support)** pelo suporte estendido e estabilidade.
* **Java 17 (LTS)** e **Java 21 (LTS)** são os padrões mais adotados atualmente, especialmente com Spring Boot 3+.

Distribuições recomendadas (gratuitas e de código aberto):
* **Eclipse Temurin (Adoptium):** Uma das distribuições OpenJDK mais populares do mercado.
* **Amazon Corretto:** Distribuição de alto desempenho mantida pela AWS.
* **Oracle OpenJDK / GraalVM:** Ótima para compilação nativa.

---

## 2. Instalação e Variáveis de Ambiente

### **No macOS (via Homebrew ou manual)**
1. Instalar via Homebrew:
   ```bash
   brew install openjdk@17
   ```
2. Configurar o arquivo `~/.zshrc`:
   ```bash
   export JAVA_HOME=$(/usr/libexec/java_home -v 17)
   export PATH=$JAVA_HOME/bin:$PATH
   ```
3. Recarregar as configurações:
   ```bash
   source ~/.zshrc
   ```

### **No Windows**
1. Baixe o instalador `.msi` ou `.exe` do Eclipse Temurin ou Oracle JDK.
2. Nas variáveis de sistema do Windows:
   * Crie a variável: `JAVA_HOME` com o caminho da instalação (ex: `C:\Program Files\Eclipse Adoptium\jdk-17...`).
   * Na variável `Path`, adicione a entrada: `%JAVA_HOME%\bin`.

### **No Linux (Debian/Ubuntu)**
1. Instalar via apt:
   ```bash
   sudo apt update
   sudo apt install openjdk-17-jdk
   ```
2. Configurar o `~/.bashrc`:
   ```bash
   export JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64
   export PATH=$JAVA_HOME/bin:$PATH
   source ~/.bashrc
   ```

---

## 3. Como validar a instalação pelo Terminal

Abra o seu terminal e execute:

```bash
# 1. Verifica a versão do ambiente de execução (JVM/JRE)
java -version

# 2. Verifica a versão do compilador (JDK)
javac -version
```

Se ambos os comandos responderem com o número da versão sem erros, seu ambiente está 100% pronto!
