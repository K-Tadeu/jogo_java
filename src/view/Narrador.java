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
                "",
                "Você não se lembra de como chegou ali.",
                "Não se lembra de quanto tempo esteve desacordado.",
                "Não se lembra de nada antes da escuridão.",
                "",
                "Você está sozinho.",
                "Ou pelo menos é o que você espera..."

        };
        renderer.renderizar(intro);
    }

    // Narração do personagem

    public void telaCacarSucesso(Personagem player1) {
         String[][] arrayTextosCacarSucesso =
        {
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
        String[][] arrayTextosCacarFalha = 
        {
            {
                "Você se apoia em uma árvore para não cair.",
                "Sem descanso, não há sobrevivência."
            },
            {
                "Você dá alguns passos na floresta…",
                "Mas o cansaço vence. Agora não é hora de caçar."

            },
            {
                "Sua visão fica turva enquanto tenta avançar pela mata.",
                "Você não tem forças para continuar a caçada."
            }
        };
        renderer.renderizar(arrayTextosCacarFalha[random.nextInt(0,3)]);
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

        public void encerrarGame(){
        String[] arrayEncerrarGame = {
            "A floresta finalmente silencia.",
            "Seus passos cessam, sua jornada termina...",
            "Entre sombras e sussurros do vento, seu nome se perde na escuridão.",
            "",
            "Você encerrou o jogo com: "
        };
        renderer.renderizar(arrayEncerrarGame);
    }

}