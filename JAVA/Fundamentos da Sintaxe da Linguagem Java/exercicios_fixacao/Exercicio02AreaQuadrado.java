package exercicios_fixacao;

import java.util.Scanner;

/**
 * Exercício 2:
 * Escreva um código que receba o tamanho do lado de um quadrado,
 * calcule sua área e exiba na tela.
 * Fórmula: área = lado X lado
 */
public class Exercicio02AreaQuadrado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do lado do quadrado: ");
        double lado = scanner.nextDouble();

        double area = lado * lado;

        System.out.println("A área do quadrado de lado " + lado + " é: " + area);

        scanner.close();
    }
}
