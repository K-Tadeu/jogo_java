package application;

import service.GameEngine;

public class App {
    public static void main(String[] args) throws Exception {

        GameEngine jogo = new GameEngine();
        jogo.run();
    }
}