package auto.learning.javier.torneo.entity;

/**
 * @author TheJavier37 (Javier Guarnizo Vega)
 */
public class Jugador {

    private String nombre;
    private String equipo;
    private int puntaje;
    private int partidasJugadas;

    public Jugador(String nombre, String equipo, int puntaje, int partidasJugadas) {
        this.nombre = nombre;
        this.equipo = equipo;
        this.puntaje = puntaje;
        this.partidasJugadas = partidasJugadas;
    }

    public void sumarVictoria() {
        this.puntaje += 3;
        this.partidasJugadas += 1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public int getPartidasJugadas() {
        return partidasJugadas;
    }

    public void setPartidasJugadas(int partidasJugadas) {
        this.partidasJugadas = partidasJugadas;
    }
}
