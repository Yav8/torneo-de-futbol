import java.util.ArrayList;
import java.util.HashSet;

/**
 * La clase Torneo contiene informacion relacionada 
 * con los resultados de cada equipo en un torneo.
 *
 * @author Javier de Cea Dominguez.
 * @version 18-05-2018
 */
public class Torneo {
    public static final int NUMERO_CARACTERES_DESDE_EL_COMIENZO_HASTA_LA_PRIMERA_BARRRA = 31;
    private static final int NUMERO_CARACTERES_DE_LA_PALABRA_EQUIPO = 6;
    private static final String VICTORIA = "gana";
    private static final String DERROTA = "pierde";
    private static final String EMPATE = "empata";
    private ArrayList<Equipo> listaEquipos;
    private HashSet<Integer> ConjuntoDePuntos;
    
    /**
     * Constructor para objetos de la clase Torneo.
     */
    public Torneo() {
        listaEquipos = new ArrayList<>();
        ConjuntoDePuntos = new HashSet<>();
    }
    
    /**
     * Fija los resultados de cada equipo en cada partido.
     * 
     * @param resultados Los resultados de cada partido.
     */
    public void indicarResultados(String resultados) {
        String resultadosDeCadaEquipo[] = resultados.split("\n");
        ArrayList<Equipo> temporal = new ArrayList<>();
        for (int contador1 = 0; contador1 < resultadosDeCadaEquipo.length; contador1++) {
            String partesDelResultadoDeCadaEquipo[] = resultadosDeCadaEquipo[contador1].split(";");
            for (int contador2  = 0; contador2 < partesDelResultadoDeCadaEquipo.length; contador2++) {
                if (contador2 < partesDelResultadoDeCadaEquipo.length - 1) {
                    temporal.add(new Equipo(partesDelResultadoDeCadaEquipo[contador2]));
                }
                if (contador2 == partesDelResultadoDeCadaEquipo.length - 1 && partesDelResultadoDeCadaEquipo[contador2].equals(VICTORIA)) {
                    temporal.get(contador2 - 2).sumarPartido();
                }
                else if (contador2 == partesDelResultadoDeCadaEquipo.length - 1 && partesDelResultadoDeCadaEquipo[contador2].equals(DERROTA)) {
                    
                }
                else if (contador2 == partesDelResultadoDeCadaEquipo.length - 1 && partesDelResultadoDeCadaEquipo[contador2].equals(EMPATE)) {
                    
                }     
            }
        }         
    }
    
    /**
     * Devuelve la clasificacion de los equipos.
     * 
     * @return Devuelve un String con la clasificacion de los equipos.
     */
    public String mostrarClasificacion() {
        String aDevolver = toString();
        for (Equipo equipo : listaEquipos) {
            aDevolver += equipo.toString();
        }
        return aDevolver;
    }
    
    /**
     * Devuelve las caracteristicas comunes a los equipos.
     * 
     * @return Devuelve un String con las caracteristicas comunes a los equipos.
     */
    @Override
    public String toString() {
        String espaciosEnBlanco = "";
        int numeroEspaciosEnBlanco = NUMERO_CARACTERES_DESDE_EL_COMIENZO_HASTA_LA_PRIMERA_BARRRA - NUMERO_CARACTERES_DE_LA_PALABRA_EQUIPO;
        for (int contador = 0; contador < numeroEspaciosEnBlanco; contador++) {
            espaciosEnBlanco += " ";
        }
        return "Equipo" + espaciosEnBlanco + "|  J |  G |  E |  P |  P\n"; 
    }
}
