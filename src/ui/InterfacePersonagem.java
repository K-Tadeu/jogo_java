package ui;

import model.Personagem;

public class InterfacePersonagem{

    ConsoleRenderer renderer = new ConsoleRenderer();
    
    public void dadosPersonagem(Personagem player1){
        String[] dados = player1.status();
        renderer.renderizar(dados);
    }
}
