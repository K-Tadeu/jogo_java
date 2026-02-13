package ui;

import util.Pausas;

public class Interface {

    public void renderizar(String[] linhas){
        for(int linha = 0; linha < linhas.length; linha++){
            String stringAtual = linhas[linha];
            for(int i=0; i<stringAtual.length() ; i++){
                char caracter = stringAtual.charAt(i);
                System.out.print(caracter);
                Pausas.pausar(50);
            }
            System.out.println();
            Pausas.pausar(500);
        }
    }

    public void gameOver(){
        String[] arrayGameOver = new String[3];
        arrayGameOver[0] = "=================================";
        arrayGameOver[1] = "----------- GAME OVER -----------";
        arrayGameOver[2] = "=================================";
        renderizar(arrayGameOver);
    }
}
