package dominio;

public class Ladrao{

    private String nomeLadrao;
    private int comidaLadrao = 0;

    public void Roubar(Personagem p1){
        if (p1.getComida() > 0) {
            System.out.println("QUE DROGA!!! O ladrão acabou de roubar sua comida!");
            p1.setComida(p1.getComida()-1);
            comidaLadrao++;
        }else{
        System.out.println("O ladrão tentou te roubar, mas voce nao tinha comida");
        }
    }

    public void statusLadrao(){
        System.out.printf("O ladrão ja possui %d de comida", comidaLadrao);
    }

}