package exercicios_fixacao;

import java.util.Scanner;

/**
 * Exercício 3:
 * Escreva um código que receba a base e a altura de um retângulo,
 * calcule sua área e exiba na tela.
 * Fórmula: área = base X altura
 */
public class Exercicio03AreaRetangulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da base do retângulo: ");
        double base = scanner.nextDouble();

        System.out.print("Digite o valor da altura do retângulo: ");
        double altura = scanner.nextDouble();

        double area = base * altura;

        System.out.println("A área do retângulo com base " + base + " e altura " + altura + " é: " + area);

        scanner.close();
    }
}
