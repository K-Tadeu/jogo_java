package model;
public class TurnoManager {
    private int turnoCont;
    private int turnoNoDia;
    private String periodo = "Manhã";
    private int dias = 1;
    private boolean ehManha = true;

    // adiciona um turno
    public void addTurno() {
        turnoCont++;
    }

    // troca o período para manha e noite
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

    // retorna a contagem de turnos
    public int getTurnoCont() {
        return turnoCont;
    }

    // definir contagem de turnos em outras classes
    public void setTurnoCont(int turnoCont) {
        this.turnoCont = turnoCont;
    }

    // retorna o periodo atual (manhã ou noite)
    public String getPeriodo() {
        return periodo;
    }

}
