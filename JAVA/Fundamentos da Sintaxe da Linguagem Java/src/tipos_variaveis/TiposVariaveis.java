package tipos_variaveis;

/**
 * Aula: Tipos e Variáveis em Java
 *
 * PONTOS-CHAVE DA SINTAXE:
 * 1. Java é fortemente tipada: o tipo da variável define seu tamanho na memória
 *    e as operações válidas com ela.
 * 2. Primitivos vs Objetos: tipos primitivos guardam valores diretos na pilha (stack),
 *    enquanto objetos/referências guardam o endereço na heap.
 */
public class TiposVariaveis {

    public static void main(String[] args) {

        // ==========================================
        // 1. TIPOS PRIMITIVOS INTEIROS
        // ==========================================
        byte idade = 123;             // 1 byte  (-128 a 127)
        short ano = 2026;            // 2 bytes (-32.768 a 32.767)
        int cep = 21070333;          // 4 bytes (tipo padrão para inteiros em Java)
        
        // RESSALVA IMPORTANTE:
        // Se um literal inteiro ultrapassar a capacidade do int, ou se for declarado
        // como 'long', deve terminar obrigatoriamente com o sufixo 'L' (maiúsculo).
        long cpf = 98765432109L;     // 8 bytes

        // ==========================================
        // 2. TIPOS DE PONTO FLUTUANTE
        // ==========================================
        // RESSALVA: Por padrão, qualquer número com casas decimais (ex: 3.14) é considerado 'double'.
        // Para declarar como 'float', o sufixo 'F' é obrigatório, senão o compilador acusa erro.
        float pi = 3.14F;
        double salario = 2500.50;    // tipo padrão para decimais (8 bytes, precisão dupla)

        // ==========================================
        // 3. CASTING (CONVERSÃO DE TIPOS)
        // ==========================================
        short numeroCurto = 1;
        int numeroNormal = numeroCurto; // Promoção automática (sem perigo de perda de dados)
        
        // RESSALVA:
        // O compilador Java é cauteloso. Mesmo que 'numeroNormal' contenha o valor 1,
        // ele proíbe atribuir um int em um short sem um cast explícito:
        short numeroCurto2 = (short) numeroNormal; // Cast explícito: assumimos o risco de overflow

        // ==========================================
        // 4. VARIÁVEIS VS CONSTANTES
        // ==========================================
        int numero = 5;
        numero = 10; // Variáveis podem ter seu valor reatribuído

        // Para transformar em constante, usamos a palavra-chave 'final'.
        // CONVENÇÃO DIO / JAVA: Nomes de constantes são sempre em UPPER_CASE com underline.
        final double VALOR_DE_PI = 3.14159;
        // VALOR_DE_PI = 3.15; // ERRO DE COMPILAÇÃO: cannot assign a value to final variable

        System.out.println("Idade: " + idade);
        System.out.println("Salário: R$ " + salario);
        System.out.println("Constante PI: " + VALOR_DE_PI);
        System.out.println("Valor casted para short: " + numeroCurto2);
    }
}
