package test;

import java.util.Random;
import java.util.Scanner;

import model.Ladrao;
import model.Personagem;
import model.TurnoManager;
import ui.Interface;
import util.Pausas;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        Random gerador = new Random();
        Interface tela = new Interface();
        boolean jogoAtivo = true;

        // criando personagens
        Personagem p1 = new Personagem();
        Ladrao l1 = new Ladrao();

        // criando turnos
        TurnoManager turno = new TurnoManager();

        // ------------------------------------------------- //

        // START
        System.out.println("Qual é o nome do seu personagem?\n" + "=============================================");
        p1.setNome(leitor.nextLine());

        // introdução ao loop do jogo
        System.out.println("Ok, " + p1.getNome() + ", vamos começar");
        System.out.println("=============================================");
        Pausas.pausar(1800);

        // loop infinito com ações
        while (jogoAtivo) {
            System.out.println("O que voce deseja fazer?");
            Pausas.pausar(500);
            System.out.println("1 = caçar | 2 = comer | 3 = dormir --- encerrar ");

            String opcao = leitor.next();

            switch (opcao) {
                case "1":
                    p1.cacar();
                    turno.avancarTurno();
                    turno.statusTurno();
                    break;
                case "2":
                    p1.comer();
                    turno.avancarTurno();
                    turno.statusTurno();
                    break;
                case "3":
                    p1.dormir();
                    turno.avancarTurno();
                    turno.statusTurno();
                    break;
                case "encerrar":
                    System.out.println("Obrigado por jogar, voce encerrou o jogo com: ");
                    jogoAtivo = false;

            }
            Pausas.pausar(1500);

            int random = gerador.nextInt(1, 5);
            if (random == 1) {
                l1.Roubar(p1);
            }

            String[] dados = p1.status();
            tela.renderizar(dados);
        }

    }
}