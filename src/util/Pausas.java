package util;

public class Pausas {
    public static void pausar(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            System.out.println("Pausa interrompida.");
        }
    }
}
