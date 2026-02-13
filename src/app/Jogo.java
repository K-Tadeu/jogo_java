package app;

import java.util.Random;
import java.util.Scanner;

import model.Ladrao;
import model.Personagem;
import model.TurnoManager;
import ui.Interface;
import util.Pausas;

public class Jogo {

    private Scanner leitor;
    private Interface tela;
    private Personagem player1;
    private Ladrao ladrao1;
    private TurnoManager turno;
    private boolean jogoAtivo = true;

    public Jogo() {
        leitor = new Scanner(System.in);
        tela = new Interface();
        player1 = new Personagem();
        ladrao1 = new Ladrao();
        turno = new TurnoManager();
    }

    public void game() {
        IniciarGame();

        System.out.println("Ok, " + player1.getNome() + ", vamos começar");
        System.out.println("=============================================");
        Pausas.pausar(1800);

        LoopGame();
    }

    public void IniciarGame() {
        System.out.println("Qual é o nome do seu personagem?\n" + "=============================================");
        player1.setNome(leitor.nextLine());
    }

    public void LoopGame() {
        while (jogoAtivo) {

            System.out.println("O que voce deseja fazer?");
            Pausas.pausar(500);
            System.out.println("1 = caçar | 2 = comer | 3 = dormir --- encerrar ");

            String opcao = leitor.next();

            switch (opcao) {
                case "1":
                    player1.cacar();
                    turno.avancarTurno();
                    turno.statusTurno();
                    break;
                case "2":
                    player1.comer();
                    turno.avancarTurno();
                    turno.statusTurno();
                    break;
                case "3":
                    player1.dormir();
                    turno.avancarTurno();
                    turno.statusTurno();
                    break;
                case "encerrar":
                    System.out.println("Obrigado por jogar, voce encerrou o jogo com: ");
                    jogoAtivo = false;

            }
            Pausas.pausar(1500);

            if(!player1.estaVivo()){
                tela.gameOver();
                jogoAtivo = false;
            }

            ladrao1.ChanceRoubar(player1);

            String[] dados = player1.status();
            tela.renderizar(dados);
        }

    }

}