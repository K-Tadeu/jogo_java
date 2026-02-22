package ui;

import model.Personagem;
import service.ConsoleRenderer;

public class InterfaceMenus {

    ConsoleRenderer renderer = new ConsoleRenderer();
    

    String separarTela = "===============================================\n";

    public void telaNomePersonagem() {
        String[] arrayNomePersonagem = {
                "Qual o nome do seu personagem?",
                separarTela
        };
        renderer.renderizar(arrayNomePersonagem);
    }

    public void telaInicio(Personagem player1) {
        String[] arrayTelaInicio = {
                "Ok, " + player1.getNome() + ", vamos começar!",
                separarTela
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

// System.out.println("Ok, " + player1.getNome() + ", vamos começar");
// System.out.println("=============================================");