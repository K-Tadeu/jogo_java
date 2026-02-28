package view;

import service.ConsoleRenderer;

public class Narrador {
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

        };
        renderer.renderizar(intro);
    }

}