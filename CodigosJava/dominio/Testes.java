package dominio;

import java.util.Random;
import java.util.Scanner;

public class Testes {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random gerador = new Random();

        boolean jogoAtivo = true;

        Personagem p1 = new Personagem();
        Ladrao l1 = new Ladrao();

        TurnoManager turno = new TurnoManager();

        // ------------------------------------------------- //

        // System.out.println("Qual é o nome do seu personagem?\n" + "=============================================");
        // p1.setNome(leitor.nextLine());

        // System.out.println("Ok, " + p1.getNome() + ", vamos começar");
        System.out.println("=============================================");
        Pausas.pausar(1800);

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

            p1.status();
            
        }

    }
}
