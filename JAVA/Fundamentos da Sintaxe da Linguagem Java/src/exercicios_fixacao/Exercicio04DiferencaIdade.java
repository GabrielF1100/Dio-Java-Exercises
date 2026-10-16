package exercicios_fixacao;

import java.util.Scanner;

/**
 * Exercício 4:
 * Escreva um código que receba o nome e a idade de 2 pessoas
 * e imprima a diferença de idade entre elas.
 */
public class Exercicio04DiferencaIdade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Dados da primeira pessoa
        System.out.print("Digite o nome da primeira pessoa: ");
        String nome1 = scanner.nextLine();
        System.out.print("Digite a idade de " + nome1 + ": ");
        int idade1 = scanner.nextInt();
        scanner.nextLine(); // Limpeza do buffer do teclado após ler número

        // Dados da segunda pessoa
        System.out.print("\nDigite o nome da segunda pessoa: ");
        String nome2 = scanner.nextLine();
        System.out.print("Digite a idade de " + nome2 + ": ");
        int idade2 = scanner.nextInt();

        // Math.abs garante que a diferença seja sempre positiva (valor absoluto)
        int diferenca = Math.abs(idade1 - idade2);

        System.out.println("\n--- RESULTADO ---");
        System.out.println("A diferença de idade entre " + nome1 + " (" + idade1 + " anos) e " 
                + nome2 + " (" + idade2 + " anos) é de " + diferenca + " ano(s).");

        scanner.close();
    }
}
