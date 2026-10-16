package operadores;

/**
 * Aula: Operadores em Java
 *
 * RESSALVAS E PEGADINHAS CLÁSSICAS:
 * 1. O operador '+' serve tanto para soma quanto para concatenação de Strings.
 * 2. Ordem de incremento: pré-fixado (++x) altera antes da avaliação; pós-fixado (x++) altera depois.
 * 3. Comparação de Strings/Objetos com '==' compara endereços de memória, não conteúdo. Use .equals().
 * 4. Operadores lógicos '&&' e '||' realizam curto-circuito (short-circuit).
 */
public class OperadoresPratica {

    public static void main(String[] args) {

        // ==========================================
        // 1. CONCATENAÇÃO VS SOMA
        // ==========================================
        // RESSALVA: A partir do momento em que o compilador encontra uma String,
        // ele converte as próximas operações de '+' em concatenação!
        String concatenacao = 1 + 1 + 1 + "1";   // Resultado: "31" (soma 1+1+1=3, depois concatena com "1")
        String concatenacao2 = "1" + 1 + 1 + 1;  // Resultado: "1111" (encontrou String logo de início)
        String concatenacao3 = "1" + (1 + 1 + 1); // Resultado: "13" (parênteses têm prioridade na execução)

        System.out.println("Concatenação 1: " + concatenacao);
        System.out.println("Concatenação 2: " + concatenacao2);
        System.out.println("Concatenação 3: " + concatenacao3);

        // ==========================================
        // 2. UNÁRIOS E INCREMENTO / DECREMENTO
        // ==========================================
        int valor = 5;
        // RESSALVA: Imprimir valor++ imprime o valor ATUAL (5) e só depois incrementa para 6 na memória.
        System.out.println("Pós-incremento na impressão: " + valor++); // Imprime 5
        System.out.println("Valor após pós-incremento: " + valor);     // Imprime 6

        // Já ++valor incrementa primeiro na memória e depois entrega o valor atualizado.
        System.out.println("Pré-incremento: " + ++valor);              // Imprime 7

        // Inversão lógica
        boolean ativo = true;
        System.out.println("Negação booleana: " + !ativo);             // Imprime false

        // ==========================================
        // 3. OPERADOR TERNÁRIO (if/else enxuto)
        // ==========================================
        // Sintaxe: <Expressão Condicional> ? <Caso true> : <Caso false>
        int a = 6;
        int b = 6;
        String resultadoTernario = (a == b) ? "iguais" : "diferentes";
        System.out.println("Resultado do ternário: " + resultadoTernario);

        // ==========================================
        // 4. RELACIONAIS E COMPARAÇÃO: '==' VS '.equals()'
        // ==========================================
        String nomeUm = "Gabriel";
        String nomeDois = new String("Gabriel");

        // RESSALVA CRUCIAL:
        // '==' compara se as referências apontam para o MESMO objeto na memória.
        // '.equals()' compara o CONTEÚDO literal dos textos.
        System.out.println("Comparação com == (referência): " + (nomeUm == nomeDois)); // false!
        System.out.println("Comparação com .equals() (conteúdo): " + nomeUm.equals(nomeDois)); // true!

        // ==========================================
        // 5. OPERADORES LÓGICOS E CURTO-CIRCUITO
        // ==========================================
        boolean condicao1 = true;
        boolean condicao2 = false;

        // RESSALVA: '&&' só avalia o segundo termo se o primeiro for verdadeiro.
        // '||' só avalia o segundo termo se o primeiro for falso.
        if (condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras.");
        }

        if (condicao1 || condicao2) {
            System.out.println("Pelo menos uma das condições é verdadeira.");
        }
    }
}
