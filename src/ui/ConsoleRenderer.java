package ui;

import util.Pausas;

public class ConsoleRenderer {
    
        public void renderizar(String[] linhas) {
        for (int linha = 0; linha < linhas.length; linha++) {
            String stringAtual = linhas[linha];
            for (int i = 0; i < stringAtual.length(); i++) {
                char caracter = stringAtual.charAt(i);
                System.out.print(caracter);
                Pausas.pausar(35);
            }
            System.out.println();
            Pausas.pausar(500);
        }
    }
}
