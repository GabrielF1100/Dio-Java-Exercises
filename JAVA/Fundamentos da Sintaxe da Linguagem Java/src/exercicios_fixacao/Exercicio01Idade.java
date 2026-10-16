package exercicios_fixacao;

import java.time.Year;
import java.util.Scanner;

/**
 * Exercício 1:
 * Escreva um código que receba o nome e o ano de nascimento de alguém
 * e imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"
 */
public class Exercicio01Idade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o ano em que você nasceu: ");
        int anoNascimento = scanner.nextInt();

        // Obtém o ano atual dinamicamente do sistema
        int anoAtual = Year.now().getValue();
        int idade = anoAtual - anoNascimento;

        System.out.println("Olá " + nome + " você tem " + idade + " anos");

        scanner.close();
    }
}
