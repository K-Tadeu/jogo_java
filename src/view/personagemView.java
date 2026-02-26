package view;

import model.Personagem;
import service.ConsoleRenderer;

public class personagemView {

    ConsoleRenderer renderer = new ConsoleRenderer(5);

    public void dadosPersonagem(Personagem player1) {
        String[] dados = player1.status();
        renderer.renderizar(dados);
    }

    // ----- Ações personagem -----

    // public void telaCacarSucesso(Personagem player1){
    //     String[] arrayCacarSucesso =  
    //     {
    //         player1.getNome() + " está caçando",
    //         ".",
    //         ".",
    //         "."
    //     };
    //     renderer.renderizar(arrayCacarSucesso);
    // }

        public void telaCacarSucesso(Personagem player1){
        String[] arrayCacarSucesso =  
        {
            player1.getNome() + " .----------------.  .----------------.  .----------------.  .----------------.  .-----------------. .----------------.  .----------------. ",
                                "| .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. |",
                                "| |     ______   | || |      __      | || |     ______   | || |      __      | || | ____  _____  | || |  ________    | || |     ____     | |",
                                "| |   .' ___  |  | || |     /  \\     | || |   .' ___  |  | || |     /  \\     | || ||_   \\|_   _| | || | |_   ___ `.  | || |   .'    `.   | |",
                                



        };
        renderer.renderizar(arrayCacarSucesso);
    }



    public void telaCacarFalha() {

    }
}
