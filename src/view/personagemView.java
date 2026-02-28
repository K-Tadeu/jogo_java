package view;

import model.Personagem;
import service.ConsoleRenderer;

public class PersonagemView {

    ConsoleRenderer renderer = new ConsoleRenderer();

    public void dadosPersonagem(Personagem player1) {
        String[] dados = player1.status();
        renderer.renderizar(dados);
    }

    // ----- Ações personagem -----

        public void telaCacarSucesso(Personagem player1){
        //String[] arrayCacarSucesso =  {}
        //renderer.renderizar(arrayCacarSucesso);
    }

    public void telaCacarFalha() {

    }
}
