/**
 * Aula 4: Operações Aritméticas e Manipulação Básica
 * 
 * Demonstra como realizar cálculos simples, concatenação de textos
 * e formatação de saída no console.
 */
public class OperadoresBasicos {

    public static void main(String[] args) {
        int numero1 = 20;
        int numero2 = 6;

        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        double divisao = (double) numero1 / numero2; // casting para double para não perder casas decimais
        int resto = numero1 % numero2;

        System.out.println("=== Operações Básicas em Java ===");
        System.out.println("Número 1: " + numero1);
        System.out.println("Número 2: " + numero2);
        System.out.println("---------------------------------");
        System.out.println("Soma (+)           : " + soma);
        System.out.println("Subtração (-)      : " + subtracao);
        System.out.println("Multiplicação (*)  : " + multiplicacao);
        System.out.printf("Divisão (/)        : %.2f\n", divisao);
        System.out.println("Módulo / Resto (%) : " + resto);
    }
}
