package metodos_smarttv;

/**
 * Classe de Execução: Simula o Usuário interagindo com a SmartTV.
 *
 * PONTO PEDAGÓGICO:
 * Separar a definição do objeto (SmartTv) da sua execução/uso (Usuario)
 * é o primeiro passo para compreender modularidade e Orientação a Objetos.
 */
public class Usuario {

    public static void main(String[] args) {

        // Instanciando o objeto da classe SmartTv
        SmartTv smartTv = new SmartTv();

        System.out.println("=== ESTADO INICIAL DA TV ===");
        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        System.out.println("\n--- INTERAGINDO COM A TV ---");
        
        // 1. Ligando a TV
        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);

        // 2. Ajustando volume
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume Final: " + smartTv.volume);

        // 3. Trocando de canal
        smartTv.subirCanal();
        smartTv.subirCanal();
        
        // Mudança direta com parâmetro
        smartTv.mudarCanal(13);
        System.out.println("Canal Final: " + smartTv.canal);

        // 4. Desligando a TV
        smartTv.desligar();
        System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);
    }
}
