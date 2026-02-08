package dominio;
public class Testes {
    
    TurnoManager testeTurnos = new TurnoManager();
    int turnos = testeTurnos.getTurnoCont();

    //recebo quantos turnos quero pular e passo pro contador de turnos
    public void pularTurnos(int turno){
        this.turnos = turno;
        testeTurnos.setTurnoCont(turnos);
    }



}
