package model;

import java.util.Random;

import view.Narrador;

public class Ladrao {

    private Random gerador = new Random();
    private Narrador narrador = new Narrador();
    // private String nomeLadrao;
    private int comidaLadrao = 0;

    public void roubar(Personagem player1) {
        if (player1.getComida() > 0) {
            //System.out.println("QUE DROGA!!! O ladrão acabou de roubar sua comida!");
            narrador.ladraoRoubarSucesso1(); 
            player1.setComida(player1.getComida() - 1);
            comidaLadrao++;
        } else {
            narrador.ladraoRoubarFalha();
        }
    }

    public void chanceRoubar(Personagem player1) {
        int random = gerador.nextInt(1, 5);
        if (random == 1) {
            roubar(player1);
        }
    }

    public void statusLadrao() {
        System.out.printf("O ladrão ja possui %d de comida", comidaLadrao);
    }

}