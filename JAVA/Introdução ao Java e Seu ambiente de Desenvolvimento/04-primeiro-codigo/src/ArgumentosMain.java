/**
 * Aula 4: Passagem de Parâmetros pela Linha de Comando (String[] args)
 * 
 * Como executar pelo terminal passando parâmetros:
 *   javac ArgumentosMain.java
 *   java ArgumentosMain Gabriel 25 1.75
 * 
 * Como configurar na IDE:
 *   - No IntelliJ: Run > Edit Configurations > Program arguments
 *   - No Eclipse: Run Configurations > Arguments > Program arguments
 */
public class ArgumentosMain {

    public static void main(String[] args) {
        System.out.println("=== Parâmetros Recebidos via Linha de Comando ===");

        // Verifica se algum argumento foi informado
        if (args.length == 0) {
            System.out.println("Nenhum argumento foi passado.");
            System.out.println("Dica: execute assim no terminal -> java ArgumentosMain SeuNome SuaIdade");
            return;
        }

        // Percorre e imprime cada argumento passado
        System.out.println("Total de argumentos recebidos: " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argumento [" + i + "]: " + args[i]);
        }
    }
}
