package model;

import java.util.Random;

import util.Pausas;

public class Personagem {
    Random gerador = new Random();
    private String nome;
    private int estamina = 5;
    private int fome = 5;
    private int sono = 5;
    private int comida = 0;
    private int vida = 100;

    // ------------------ AÇÕES DO PERSONAGEM ------------------------

    public boolean cacar() {

        if (estamina >= 2) {
            estamina -= 2;
            comida += gerador.nextInt(1, 3);
            fome = Math.min(fome + 1, 10);
            sono = Math.min(sono + 1, 10);
            return true;
        } else {
            return false;
        }
    }

        public boolean dormir() {
        if (sono >= 1) {
            System.out.println(nome + " esta dormindo...");
            sono--;
            estamina = estamina + 1 <= 10 ? estamina + 1 : 10;
            Pausas.pausar(1800);
            return true;
        } else {
            System.out.println(nome + " esta sem sono...");
            return false;
        }
    }

    public boolean comer() {
        if (fome == 0) {
            return false;
        } else if (comida == 0) {
            return false;
        } else {
            --fome;
            --comida;
            Pausas.pausar(1800);
            estamina = Math.min(estamina + 1, 10);
            return true;
        }
    }

    // ---------------------------------------------------------------

    public void verificarCondicoes(Personagem player1) {

        if (estamina < 0) {
            vida -= 10;
        } else if (fome == 10) {
            vida -= 20;
        } else if (sono >= 10) {
            vida -= 10;
        }
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public String[] status() {
        String[] linhas = {
                "estamina..." + this.estamina,
                "Fome......" + this.fome,
                "Sono......" + this.sono,
                "Comida...." + this.comida + "\n"
        };
        return linhas;
    }

    // ---------- GET ----------

    public String getNome() {
        return nome;
    }

    public int getComida() {
        return comida;
    }

    public int getEstamina() {
        return estamina;
    }

    public int getFome() {
        return fome;
    }

    public int getSono() {
        return sono;
    }

    // ---------- SET ----------

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setComida(int comida) {
        this.comida = comida;
    }

    public void setEstamina(int estamina) {
        this.estamina = estamina;
    }

    public void setFome(int fome) {
        this.fome = fome;
    }

    public void setSono(int sono) {
        this.sono = sono;
    }

}
