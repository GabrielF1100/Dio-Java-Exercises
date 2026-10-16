package escopo_documentacao;

/**
 * <h1>Calculadora com Demonstração de Escopo e Documentação (Javadoc)</h1>
 * A Calculadora realiza operações matemáticas e demonstra o ciclo de vida
 * das variáveis locais versus parâmetros de métodos.
 * <p>
 * <b>Nota:</b> Leia atentamente a documentação desta classe para entender
 * o uso de tags do Javadoc e as regras de escopo.
 *
 * @author  Gabriel Felippe Baptista
 * @version 1.0
 * @since   2026-10-16
 */
public class CalculadoraEscopoDoc {

    // Variável de instância/classe (escopo global dentro do objeto)
    int historicoCalculos = 0;

    /**
     * Este método calcula a soma entre dois números inteiros.
     *
     * @param numeroUm   primeiro parâmetro do método (escopo: restrito ao método)
     * @param numeroDois  segundo parâmetro do método (escopo: restrito ao método)
     * @return int       resultado da soma dos dois números
     */
    public int somar(int numeroUm, int numeroDois) {
        // Escopo local do método
        int resultado = numeroUm + numeroDois;
        historicoCalculos++;
        return resultado;
    }

    /**
     * Demonstração de Escopo de Bloco e Pegadinhas Comuns.
     */
    public void demonstrarEscopo(double saldoInicial) {
        // Variável local do método
        double novoSaldo = saldoInicial;

        for (int i = 1; i <= 3; i++) {
            // 'i' e 'bonus' só existem DENTRO deste bloco for!
            double bonus = i * 10.0;
            novoSaldo += bonus;
            System.out.println("Loop " + i + " - Bônus aplicado: " + bonus);
        }

        // RESSALVA DE ESCOPO:
        // A linha abaixo causaria erro de compilação:
        // System.out.println(bonus); // ERRO: cannot find symbol 'bonus'
        // System.out.println(i);     // ERRO: cannot find symbol 'i'

        System.out.println("Saldo final recalculado: R$ " + novoSaldo);
    }

    public static void main(String[] args) {
        CalculadoraEscopoDoc calc = new CalculadoraEscopoDoc();
        int soma = calc.somar(15, 27);
        System.out.println("Resultado da soma documentada: " + soma);

        calc.demonstrarEscopo(100.0);
    }
}
