package view;

import model.Personagem;
import service.ConsoleRenderer;

public class MenuView {

    ConsoleRenderer renderer = new ConsoleRenderer();

    public void telaNomePersonagem() {
        
        String[] arrayNomePersonagem = {
                "Escreva seu nome na história… se conseguir sobreviver.",
                "\n"
        };
        renderer.renderizar(arrayNomePersonagem);
    }

    public void telaInicio(Personagem player1) {
        String[] arrayTelaInicio = {
                "Muito bem, " + player1.getNome(),
                "Está preparado?",
                "\n",
                "Seu único objetivo (por enquanto), é não morrer de fome ou sono.",
                "Quando fome ou sono chega a 10, você perde vida... Cuidado!",
                "\n"
        };
        renderer.renderizar(arrayTelaInicio);
    }

    public void telaLoopOpcao(){

        String[] arrayOpcaoAcao = {
            "O que você deseja fazer?",
            "1 = caçar | 2 = comer | 3 = dormir --- encerrar \n"
        };
        renderer.renderizar(arrayOpcaoAcao);
    }

    public void encerrarGame(){
        String[] arrayEncerrarGame = {
            "Obrigado por jogar!\n",
            "Você encerrou o jogo com: "
        };
        renderer.renderizar(arrayEncerrarGame);
    }

    public void gameOver() {
        String[] arrayGameOver = {
                "=================================",
                "----------- GAME OVER -----------",
                "================================="
        };
        renderer.renderizar(arrayGameOver);
    }
}
