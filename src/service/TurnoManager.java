package service;
public class TurnoManager {
    private int turnoCont;
    private int turnoNoDia;
    private String periodo = "Manhã";
    private int dias = 1;
    private boolean ehManha = true;

    public void addTurno() {
        turnoCont++;
    }

    public void manhaNoite() {
        turnoNoDia = (turnoNoDia + 1) % 10;

        if (turnoNoDia < 5) {
            ehManha = true;
            periodo = "Manhã";
        } else {
            ehManha = false;
            periodo = "Noite";
        }
    }

    public void proxDia() {
        if (turnoNoDia == 0) {
            dias++;
        }
    }

    public void avancarTurno() {
        addTurno();
        manhaNoite();
        proxDia();
    }

    public void statusTurno() {
        System.out.println(periodo);
        System.out.println("Turno: " + turnoCont);
    }

    public int getTurnoCont() {
        return turnoCont;
    }

    public void setTurnoCont(int turnoCont) {
        this.turnoCont = turnoCont;
    }

    public String getPeriodo() {
        return periodo;
    }

}
