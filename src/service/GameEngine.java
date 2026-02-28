package service;

import java.util.Scanner;

import model.Ladrao;
import model.Personagem;
import util.Pausas;
import view.IntroView;
import view.MenuView;
import view.PersonagemView;

public class GameEngine {

    private Scanner leitor;
    private MenuView menu;
    private IntroView intro;
    private PersonagemView playerInterface;
    private Personagem player1;
    private Ladrao ladrao1;
    private TurnoManager turno;
    private boolean jogoAtivo = true;

    // private static final int pausaIntro = 1800;
    // private static final int pausaMenu = 500;
    private static final int pausaPosMenu = 1500;

    public GameEngine() {
        leitor = new Scanner(System.in);
        menu = new MenuView();
        intro = new IntroView();
        playerInterface = new PersonagemView();
        player1 = new Personagem();
        ladrao1 = new Ladrao();
        turno = new TurnoManager();
    }

    public void run() {
        
        intro.imprimeIntro();
        nomePersonagem();
        menu.telaInicio(player1);
        loopGame();
    }

    public void nomePersonagem() {
        menu.telaNomePersonagem();
        player1.setNome(leitor.nextLine());
    }

    public void loopGame() {
        while (jogoAtivo) {

            menu.telaLoopOpcao();

            String opcao = leitor.next();

            switch (opcao) {
                case "1":
                    boolean sucessoCaca = player1.cacar();
                    if (sucessoCaca) {
                        playerInterface.telaCacarSucesso(player1);
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

            playerInterface.dadosPersonagem(player1);

        }

    }

}