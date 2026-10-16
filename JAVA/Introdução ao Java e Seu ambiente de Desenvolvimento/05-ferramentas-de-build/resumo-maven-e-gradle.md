# Aula: Ferramentas de Build no Java (Maven e Gradle)

## 1. Para que serve uma Ferramenta de Build?

Quando um projeto Java cresce, compilar arquivos manualmente com `javac` e gerenciar bibliotecas externas (`.jar`) baixadas na mão se torna inviável. As ferramentas de automação de build resolvem isso:

* **Gerenciamento de dependências:** Baixam e atualizam automaticamente as bibliotecas que seu projeto precisa (como Spring Boot, drivers de banco de dados, bibliotecas de IA).
* **Compilação automatizada:** Compilam todo o código-fonte na ordem correta.
* **Execução de testes:** Rodam suites de testes unitários e de integração antes de gerar o pacote final.
* **Empacotamento:** Geram o arquivo final executável (`.jar` ou `.war`) pronto para deploy em produção.

---

## 2. Apache Maven vs. Gradle

| Característica | **Apache Maven** | **Gradle** |
| :--- | :--- | :--- |
| **Arquivo de configuração** | `pom.xml` (formato XML declarativo) | `build.gradle` (DSL Groovy ou Kotlin) |
| **Filosofia** | *Convenção sobre configuração* (estrutura rígida e padronizada) | *Flexibilidade e desempenho* (altamente customizável) |
| **Velocidade de build** | Estável e previsível | Extremamente rápido (usa cache de compilação e daemon em segundo plano) |
| **Padrão no Mercado** | Amplamente usado no ecossistema corporativo tradicional e em quase todos os cursos iniciais | Padrão no ecossistema Android e muito forte em projetos modernos de microsserviços |

---

## 3. Comandos Essenciais no Terminal

### **Maven (`mvn`)**
* `mvn clean`: Limpa a pasta `target/` de compilações anteriores.
* `mvn compile`: Compila o código-fonte do projeto.
* `mvn test`: Executa os testes automatizados.
* `mvn package`: Empacota a aplicação gerando o `.jar` dentro de `target/`.
* `mvn spring-boot:run`: Roda a aplicação Spring Boot diretamente pelo terminal.

### **Gradle (`gradle`)**
* `gradle clean`: Limpa a pasta `build/`.
* `gradle build`: Compila, testa e empacota o projeto.
* `gradle test`: Roda os testes unitários.
* `gradle bootRun`: Executa a aplicação Spring Boot.

---

## 4. Status no seu Mac

Ambas as ferramentas estão instaladas via Homebrew e integradas ao **Java 21 LTS**:
* Maven: `mvn -version` -> Apache Maven 3.10.0 (Java 21)
* Gradle: `gradle -version` -> Gradle 9.8.1 (Java 21)
