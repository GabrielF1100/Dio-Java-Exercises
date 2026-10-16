package metodos_smarttv;

/**
 * Projeto Guiado da DIO: Simulação de uma SmartTV.
 *
 * BOAS PRÁTICAS DE MÉTODOS EM JAVA:
 * 1. Nomeação: Deve ser nomeado como verbo no infinitivo ou imperativo (ex: ligar, aumentarVolume).
 * 2. Padrão: camelCase (ex: mudarCanal).
 * 3. Responsabilidade única: Cada método deve fazer apenas uma coisa de forma clara.
 */
public class SmartTv {

    // Atributos de estado da TV (características)
    public boolean ligada = false;
    public int canal = 1;
    public int volume = 25;

    // Métodos para controle de energia
    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    // Métodos de volume
    public void aumentarVolume() {
        // volume = volume + 1;
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume() {
        // volume = volume - 1;
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    // Métodos de canal
    public void subirCanal() {
        canal++;
        System.out.println("Mudando canal para cima: " + canal);
    }

    public void descerCanal() {
        canal--;
        System.out.println("Mudando canal para baixo: " + canal);
    }

    /**
     * RESSALVA: Métodos com parâmetros recebem dados externos necessários
     * para cumprir sua tarefa. Aqui recebemos o novo canal escolhido diretamente.
     */
    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("Canal alterado diretamente para: " + canal);
    }
}
