package ui;

import util.Pausas;

public class ConsoleRenderer {

    private int velocidade;

    public ConsoleRenderer() {
        this.velocidade = 35;
    }

    public ConsoleRenderer(int velocidade) {
        this.velocidade = velocidade;
    }

    public void renderizar(String[] linhas) {
        for (int linha = 0; linha < linhas.length; linha++) {
            String stringAtual = linhas[linha];
            for (int i = 0; i < stringAtual.length(); i++) {
                char caracter = stringAtual.charAt(i);
                System.out.print(caracter);
                Pausas.pausar(this.velocidade);
            }
            System.out.println();
            Pausas.pausar(500);
        }
    }


}
