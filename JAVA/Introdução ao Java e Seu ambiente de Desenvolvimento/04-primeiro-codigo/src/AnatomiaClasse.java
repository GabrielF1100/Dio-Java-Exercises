/**
 * Aula 4: Anatomia de uma Classe em Java e Convenções de Nomenclatura
 * 
 * Regras importantes:
 * 1. O nome da classe pública DEVE ser exatamente igual ao nome do arquivo (.java).
 * 2. Classes usam padrão UpperCamelCase (ex: AnatomiaClasse, MinhaPrimeiraAplicacao).
 * 3. Métodos e variáveis usam lowerCamelCase (ex: calcularMedia, nomeDoAluno).
 * 4. Constantes usam MAIUSCULAS_COM_UNDERLINE (ex: TAXA_PADRAO, PI).
 */
public class AnatomiaClasse {

    public static void main(String[] args) {
        // Declaração de variáveis
        String primeiroNome = "Gabriel";
        String segundoNome = "Felippe";
        int anoAtual = 2026;
        
        // Chamada de método auxiliar
        String nomeCompleto = gerarNomeCompleto(primeiroNome, segundoNome);
        
        // Impressão dos dados
        System.out.println("=== Anatomia de uma Classe Java ===");
        System.out.println("Aluno: " + nomeCompleto);
        System.out.println("Ano letivo: " + anoAtual);
        System.out.println("Status: Aprendendo a estrutura básica com sucesso!");
    }

    /**
     * Método auxiliar que concatena o primeiro e o segundo nome.
     */
    public static String gerarNomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
