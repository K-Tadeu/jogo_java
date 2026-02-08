package dominio;
import java.util.Random;

public class Personagem {
    Random gerador = new Random();
    private String nome;
    private int energia = 10;
    private int fome = 0;
    private int sono = 0;
    private int comida = 0;

    // -----AUMENTAR COMIDA-----

    public void cacar() {
        if (energia >= 2) {
            energia -= 2;
            comida += gerador.nextInt(1, 3);
            fome = Math.min(fome + 1, 10);
            sono = Math.min(sono + 1, 10);
            System.out.println(nome + " esta caçando...");
        } else {
            System.out.println(nome + "esta sem energia para caçar");
        }
    }

    // -----DIMINUIR SONO-----
    public void dormir() {
        if (sono >= 1) {
            System.out.println(nome + " esta dormindo...");
            sono--;
            energia = energia + 1 <= 10 ? energia + 1 : 10;
            Pausas.pausar(1800);
        } else {
            System.out.println(nome + " esta sem sono...");
        }
    }

    // -----DIMINUIR FOME-----
    public void comer() {
        if (fome == 0) {
            System.out.println("Sem fome...");
        } else if (comida == 0) {
            System.out.println("Sem comida! Vai cacar");
        } else {
            System.out.println(nome + " esta comendo...");
            --fome;
            --comida;
            Pausas.pausar(1800);
            energia = Math.min(energia + 1, 10);
        }
    }

    // ------PRINTAR STATUS-----

    public void status() {
        System.out.printf("Energia... %d,\nFome...... %d,\nSono...... %d,\nComida.... %d \n", this.energia, this.fome,
        this.sono, this.comida);
        System.out.println("\n=============================================");
    }

    // ------------ get e set ------------

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getComida() {
        return comida;
    }

    public void setComida(int comida) {
        this.comida = comida;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getFome() {
        return fome;
    }

    public void setFome(int fome) {
        this.fome = fome;
    }

    public int getSono() {
        return sono;
    }

    public void setSono(int sono) {
        this.sono = sono;
    }

    // -------------------------------------------

}
