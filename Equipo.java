/**
 * La clase Equipo contiene informacion comun a todos 
 * los equipos de futbol.
 *
 * @author Javier de Cea Dominguez.
 * @version 18-05-2018
 */
public class Equipo {
    private String nombreEquipo;
    private int partidosJugados;
    private int partidosGanados;
    private int partidosEmpatados;
    private int partidosPerdidos;
    private int puntos;
    
    /**
     * Constructor para objetos de la clase Equipo.
     * 
     * @param nombreEquipo El nombre del equipo.
     */
    public Equipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.partidosJugados = 0;
        this.partidosGanados = 0;
        this.partidosEmpatados = 0;
        this.partidosPerdidos = 0;
        this.puntos = 0;
    }      
    
    /**
     * Devuelve el nombre del equipo.
     * 
     * @return Devuelve un String que contiene el nombre
     * del equipo.
     */
    public String getNombreEquipo() {
        return nombreEquipo;
    }
    
    /**
     * Suma 1 el numero de partidos jugados.
     */
    public void sumarPartido() {
        partidosJugados += 1;
    }
    
    /**
     * Suma en 1 numero de partidos que se han ganado.
     * 
     * @param numeroPartidosGanados El numero de partidos que 
     * se van a sumar.
     */
    public void setPartidosGanados(int numero) {
        partidosGanados += 1;
    }
    
    /**
     * Fija el numero de partidos que se han empatado.
     * 
     * @param numeroPartidosEmpatados El numero de partidos que 
     * se van a empatar.
     */
    public void setPartidosEmpatados(int numeroPartidosEmpatados) {
        partidosEmpatados += numeroPartidosEmpatados;
    }
    
    /**
     * Fija el numero de partidos que se han perdido.
     * 
     * @param numeroPartidosPerdidos El numero de partidos que 
     * se van a perder.
     */
    public void setPartidosPerdidos(int numeroPartidosPerdidos) {
        partidosPerdidos += numeroPartidosPerdidos;
    }
    
    /**
     * Devuelve las caracteristicas del equipo.
     * 
     * @return Devuelve un String que contiene las 
     * caracteristicas del equipo.
     */
    @Override
    public String toString() {
        int numeroCaracteresNombreEquipo = 0;
        for (int contador = 0; contador < nombreEquipo.length(); contador++) {    
            numeroCaracteresNombreEquipo++;
        }
        int numeroEspaciosEnBlanco = Torneo.NUMERO_CARACTERES_DESDE_EL_COMIENZO_HASTA_LA_PRIMERA_BARRRA - numeroCaracteresNombreEquipo;
        for (int contador = 0; contador < numeroEspaciosEnBlanco; contador++) {
            nombreEquipo += " ";
        }
        
        return nombreEquipo + "| " + partidosJugados + "| " + partidosGanados + "| " + partidosEmpatados + "| " + partidosPerdidos + "| " + puntos + "\n";
    }
}
