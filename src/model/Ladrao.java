package model;

import java.util.Random;

public class Ladrao {

    private Random gerador = new Random();
    // private String nomeLadrao;
    private int comidaLadrao = 0;

    public void Roubar(Personagem player1) {
        if (player1.getComida() > 0) {
            System.out.println("QUE DROGA!!! O ladrão acabou de roubar sua comida!");
            player1.setComida(player1.getComida() - 1);
            comidaLadrao++;
        } else {
            System.out.println("O ladrão tentou te roubar, mas voce nao tinha comida");
        }
    }

    public void ChanceRoubar(Personagem player1) {
        int random = gerador.nextInt(1, 5);
        if (random == 1) {
            Roubar(player1);
        }
    }

    public void statusLadrao() {
        System.out.printf("O ladrão ja possui %d de comida", comidaLadrao);
    }

}