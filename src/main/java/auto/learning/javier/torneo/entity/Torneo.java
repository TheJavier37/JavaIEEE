package auto.learning.javier.torneo.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author TheJavier37 (Javier Guarnizo Vega)
 */

public class Torneo {

    private List<Jugador> jugadores;

    public Torneo() {
        this.jugadores = new ArrayList<>();
        inicializarJugadores();
    }

    private void inicializarJugadores() {
        this.jugadores.add(new Jugador("Aquino2002", "EliotBones", 0, 0));
        jugadores.add(new Jugador("CecilillaJuega", "EliotBones", 0, 0));
        jugadores.add(new Jugador("RedStar", "MafiTeam", 0, 0));
        jugadores.add(new Jugador("TheJavier37", "MafiTeam", 0, 0));
        jugadores.add(new Jugador("AudyTor", "Mordevada", 0, 0));
        jugadores.add(new Jugador("SrChester", "Mordevada", 0, 0));
        jugadores.add(new Jugador("Kisalo", "DCans", 0, 0));
        jugadores.add(new Jugador("Asa51", "DCans", 0, 0));
    }

    public boolean simularRonda(String nombre) {
        Jugador jugador = buscarPorNombre(nombre);

        if (jugador != null) {
            jugador.sumarVictoria();
            return true;
        }
        return false;
    }

    public void buscarJugador(String nombre) {
        Jugador jugador = buscarPorNombre(nombre);

        if (jugador != null) {
            System.out.println("--- JUGADOR ENCONTRADO ---");
            System.out.println("Nombre: " + jugador.getNombre());
            System.out.println("Equipo: " + jugador.getEquipo());
            System.out.println("Puntaje: " + jugador.getPuntaje());
            System.out.println("Partidas Jugadas: " + jugador.getPartidasJugadas());
        } else {
            System.out.println("El jugador '" + nombre + "' no está registrado.");
        }
    }

    public boolean modificarPuntaje(String nombre, int nuevoPuntaje) {
        Jugador jugador = buscarPorNombre(nombre);

        if (jugador != null) {
            jugador.setPuntaje(nuevoPuntaje);
            return true;
        }
        return false;
    }

    public void mostrarRanking() {
        List<Jugador> copia = new ArrayList<>(jugadores);

        for (int i = 0; i < copia.size() - 1; i++) {
            for (int j = 0; j < copia.size() - 1 - i; j++) {
                if (copia.get(j).getPuntaje() < copia.get(j + 1).getPuntaje()) {
                    Jugador temp = copia.get(j);
                    copia.set(j, copia.get(j + 1));
                    copia.set(j + 1, temp);
                }
            }
        }

        System.out.println("--- RANKING DE JUGADORES ---");
        int pos = 1;
        for (Jugador j : copia) {
            System.out.println(pos + ". " + j.getNombre() + " | Equipo: " + j.getEquipo() + " | Puntaje: " + j.getPuntaje() + " | Partidas: " + j.getPartidasJugadas());
            pos++;
        }
    }

    public Jugador obtenerJugadorGanador() {
        if (jugadores.isEmpty()) {
            return null;
        }

        Jugador ganador = jugadores.get(0);

        for (int i = 1; i < jugadores.size(); i++) {
            if (jugadores.get(i).getPuntaje() > ganador.getPuntaje()) {
                ganador = jugadores.get(i);
            }
        }

        return ganador;
    }

    private Jugador buscarPorNombre(String nombre) {
        for (Jugador j : jugadores) {
            if (j.getNombre().equalsIgnoreCase(nombre)) {
                return j;
            }
        }
        return null;
    }
}