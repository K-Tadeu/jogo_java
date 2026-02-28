package view;

import java.util.Random;
import model.Personagem;
import service.ConsoleRenderer;

public class Narrador {
    
    Random random = new Random();
    ConsoleRenderer renderer = new ConsoleRenderer();

    public void intro() {
        String[] intro = {
                "Você acorda em uma floresta desconhecida.",
                "O ar está frio.",
                "O chão está úmido.",
                "E sua cabeça lateja como se algo estivesse errado.",
                "\n",
                "Você não se lembra de como chegou ali.",
                "Não se lembra de quanto tempo esteve desacordado.",
                "Não se lembra de nada antes da escuridão.",
                "\n",
                "Você está sozinho.",
                "Ou pelo menos é o que você espera..."

        };
        renderer.renderizar(intro);
    }

    // Narração do personagem

    public void telaCacarSucesso(Personagem player1) {
         String[][] arrayTextosCacarSucesso = {
            {
                "Você se move silenciosamente pela mata e captura um coelho!",
                "O pequeno animal rende algumas porções extras de carne ao seu estoque."
            },
            {
                "Após horas rastreando pegadas, você consegue abater um cervo.",
                "Essa caçada valeu a pena; suas provisões aumentaram consideravelmente."
            },
            {
                "A sorte está ao seu lado. Um javali cruza seu caminho e você o abate.",
                "Seu estoque de comida está bem mais abastecido agora."
            }
         };
         renderer.renderizar(arrayTextosCacarSucesso[random.nextInt(0,2)]);
    }

    public void telaCacarFalha() {

    }

    // Narração do ladrão

    public void ladraoRoubarSucesso1() {
        String[] arrayRoubarSucesso = {
                "Você ouve passos leves atrás de você...",
                "Quando percebe, sua mochila está mais leve. O ladrão levou parte da sua comida."
        };
        renderer.renderizar(arrayRoubarSucesso);
    }

    public void ladraoRoubarFalha() {
        String[] arrayRoubarSucesso = {
                "Uma figura encapuzada revira sua mochila... mas não encontra nada além de migalhas.",
                "Irritado, ele desaparece na floresta."
        };
        renderer.renderizar(arrayRoubarSucesso);
    }

}