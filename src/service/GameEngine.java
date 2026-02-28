package service;

import java.util.Scanner;

import model.Ladrao;
import model.Personagem;
import util.Pausas;
import view.Narrador;
import view.MenuView;
import view.PersonagemView;

public class GameEngine {

    private Scanner input;
    private MenuView menu;
    private Narrador narrador;
    private PersonagemView personagemView;
    private Personagem player1;
    private Ladrao ladrao1;
    private TurnoManager turno;
    private boolean jogoAtivo = true;

    // private static final int pausaIntro = 1800;
    // private static final int pausaMenu = 500;
    private static final int pausaPosMenu = 1500;

    public GameEngine() {
        input = new Scanner(System.in);
        menu = new MenuView();
        narrador = new Narrador();
        personagemView = new PersonagemView();
        player1 = new Personagem();
        ladrao1 = new Ladrao();
        turno = new TurnoManager();
    }

    public void run() {     
        narrador.intro();
        nomePersonagem();
        menu.telaInicio(player1);
        loopGame();
    }

    public void nomePersonagem() {
        menu.telaNomePersonagem();
        player1.setNome(input.nextLine());
    }

    public void loopGame() {
        while (jogoAtivo) {

            menu.telaLoopOpcao();

            String opcao = input.next();

            switch (opcao) {
                case "1":
                    boolean sucessoCaca = player1.cacar();
                    if (sucessoCaca) {
                        personagemView.telaCacarSucesso(player1);
                        turno.avancarTurno();
                        turno.statusTurno();
                    }
                    break;
                case "2":
                    boolean sucessoComer = player1.comer();
                    if (sucessoComer) {
                        turno.avancarTurno();
                        turno.statusTurno();
                    }
                    break;
                case "3":
                    boolean sucessoDormir = player1.dormir();
                    if (sucessoDormir) {
                        turno.avancarTurno();
                        turno.statusTurno();
                    }
                    break;
                case "encerrar":
                    menu.encerrarGame();
                    jogoAtivo = false;

            }

            Pausas.pausar(pausaPosMenu);

            if (!player1.estaVivo()) {
                menu.gameOver();
                jogoAtivo = false;
            } else if (jogoAtivo) {
                ladrao1.chanceRoubar(player1);
            }

            personagemView.dadosPersonagem(player1);

        }

    }

}