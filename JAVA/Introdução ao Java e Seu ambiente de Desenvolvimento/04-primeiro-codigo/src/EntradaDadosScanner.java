import java.util.Locale;
import java.util.Scanner;

/**
 * Aula 4: Entrada e Saída de Dados com a classe Scanner
 * 
 * Demonstra como capturar dados digitados pelo usuário no console/terminal
 * e convertê-los para os tipos adequados (String, int, double).
 */
public class EntradaDadosScanner {

    public static void main(String[] args) {
        // Configura o Scanner para usar o ponto como separador decimal (Locale.US)
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("=== Cadastro de Estudante (Entrada via Teclado) ===");

        System.out.print("Digite seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite sua altura (ex: 1.75): ");
        double altura = scanner.nextDouble();

        System.out.println("\n--- Dados Cadastrados com Sucesso ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.printf("Altura: %.2f m\n", altura);

        // Sempre fechar o recurso do Scanner ao final
        scanner.close();
    }
}
