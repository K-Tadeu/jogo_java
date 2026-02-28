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

    //--- Caça -------------------------------------------------------------
    public void falaCacarSucesso(Personagem player1) {
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

    public void falaCacarFalha() {
        String[][] arrayTextosCacarFalha = 
        {
            {
                "Você se apoia em uma árvore para não cair.",
                "Sem descanso, não há sobrevivência."
            },
            {
                "Você dá alguns passos na floresta...",
                "Mas o cansaço vence. Agora não é hora de caçar."

            },
            {
                "Sua visão fica turva enquanto tenta avançar pela mata.",
                "Você não tem forças para continuar a caçada."
            }
        };
        renderer.renderizar(arrayTextosCacarFalha[random.nextInt(0,2)]);
    }

    //--- Comer -------------------------------------------------------------

    public void falaComerSucesso(){
        String[][] arrayTextosComerSucesso = {
            {
                "Você mastiga lentamente, saboreando cada pedaço.",
                "A sensação de fraqueza começa a desaparecer."
            },
            {
                "O cheiro da comida traz conforto.",
                "Seu corpo agradece pelo sustento."
            },
            {
                "Cada mordida reduz o vazio no seu estômago.",
                "Você se sente um pouco mais estável."
            }
        };
        renderer.renderizar(arrayTextosComerSucesso[random.nextInt(0,2)]);
    }

        public void falaComerSemComida(){
        String[][] arrayTextosComerSemComida = {
            {
                "Você abre sua mochila...",
                "Mas ela está vazia"
            },
            {
                "Sem comida!",
                "Talvez seja hora de caçar"
            },
            {
                "Algumas migalhas caem da sua bolsa",
                "É tudo o que restou."
            }
        };
        renderer.renderizar(arrayTextosComerSemComida[random.nextInt(0,2)]);
    }

            public void falaComerSemFome(){
        String[][] arrayTextosComerSemFome = {
            {
                "Você olha para a comida em suas mãos...",
                "Mas seu estômago está tranquilo. Agora não é necessário."
            },
            {
                "Seu corpo não pede alimento.",
                "Talvez seja melhor guardar para depois."
            },
            {
                "Você pensa em comer...",
                "Mas seu estômago não concorda."
            }
        };
        renderer.renderizar(arrayTextosComerSemFome[random.nextInt(0,2)]);  
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

        public void falaOpcaoInvalida(){
            String[][] arrayOpcaoInvalida = 
            {
                {
                    "Você tenta fazer algo... mas nem a floresta entendeu.",
                    "Escolha uma opção válida antes que algo escolha por você."
                },
                {
                    "Essa não é uma habilidade desbloqueada.",
                    "Tente novamente usando um número válido."
                },
                {
                    "A floresta observa sua indecisão...",
                    "Mas digitar aleatoriamente não vai salvá-lo"
                }
            };
            renderer.renderizar(arrayOpcaoInvalida[random.nextInt(0,2)]);
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