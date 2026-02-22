package ui;

import model.Personagem;
import service.ConsoleRenderer;

public class InterfacePersonagem {

    ConsoleRenderer renderer = new ConsoleRenderer();

    public void dadosPersonagem(Personagem player1) {
        String[] dados = player1.status();
        renderer.renderizar(dados);
    }

    // ----- Ações personagem -----

    public void telaCacarSucesso(Personagem player1){
        String[] arrayCacarSucesso =  
        {
            player1.getNome() + " está caçando",
            ".",
            ".",
            "."
        };
        renderer.renderizar(arrayCacarSucesso);
    }



    public void telaCacarFalha() {

    }
}
