package service;

public class TurnoManager {
    private ConsoleRenderer renderer = new ConsoleRenderer();
    private int turnoCont;
    private int turnoDentroDoDia;
    private String periodo = "Manhã";
    private int dias = 1;
    private boolean ehManha = true;

    public void addTurno() {
        turnoCont++;
    }

    public void manhaNoite() {
        turnoDentroDoDia = (turnoDentroDoDia + 1) % 10;

        if (turnoDentroDoDia < 5) {
            ehManha = true;
            periodo = "Manhã";
        } else {
            ehManha = false;
            periodo = "Noite";
        }
    }

    public void proxDia() {
        if (turnoDentroDoDia == 0) {
            dias++;
        }
    }

    public void avancarTurno() {
        addTurno();
        manhaNoite();
        proxDia();
    }

    public void statusTurno() {
        String[] arrayStatusTurno = {
                periodo,
                "Turno: " + turnoCont + "\n"
        };
        renderer.renderizar(arrayStatusTurno);
    }

    public int getTurnoCont() {
        return turnoCont;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setTurnoCont(int turnoCont) {
        this.turnoCont = turnoCont;
    }

}
