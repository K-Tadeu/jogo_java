package model;

import java.util.Random;

import util.Pausas;

public class Personagem {
    Random gerador = new Random();
    private String nome;
    private int energia = 10;
    private int fome = 0;
    private int sono = 0;
    private int comida = 0;
    private int vida = 100;

    // ------------------ AÇÕES DO PERSONAGEM ------------------------

    public boolean cacar() {

        if (energia >= 2) {
            energia -= 2;
            comida += gerador.nextInt(1, 3);
            fome = Math.min(fome + 1, 10);
            sono = Math.min(sono + 1, 10);
            System.out.println(nome + " esta caçando...");
            return true;
        } else {
            System.out.println(nome + " esta sem energia para caçar");
            return false;
        }
    }

        public boolean dormir() {
        if (sono >= 1) {
            System.out.println(nome + " esta dormindo...");
            sono--;
            energia = energia + 1 <= 10 ? energia + 1 : 10;
            Pausas.pausar(1800);
            return true;
        } else {
            System.out.println(nome + " esta sem sono...");
            return false;
        }
    }

    public boolean comer() {
        if (fome == 0) {
            System.out.println("Sem fome...");
            return false;
        } else if (comida == 0) {
            System.out.println("Sem comida! Vai cacar");
            return false;
        } else {
            System.out.println(nome + " esta comendo...");
            --fome;
            --comida;
            Pausas.pausar(1800);
            energia = Math.min(energia + 1, 10);
            return true;
        }
    }

    // ---------------------------------------------------------------

    public void verificarCondicoes(Personagem player1) {

        if (energia < 0) {
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
                "Energia..." + this.energia,
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

    public int getEnergia() {
        return energia;
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

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public void setFome(int fome) {
        this.fome = fome;
    }

    public void setSono(int sono) {
        this.sono = sono;
    }

}
