import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ejercicio6 {

    public Planets planets;

    public Ejercicio6() {
        planets = new Planets(ObtenerPlanetsRequest.Companion.get().getResults());
    }

    public Planet[] getPlanetas(){
        return planets.obtenerTodos();
    }

    public Planet[] obtenerMasPobladosQue(long poblacion){
        Planet[] planetas = new Planet[getPlanetas().length];
        short cont=0;
        for (Planet planeta : planets.obtenerTodos()) {
            if (Character.isDigit(planeta.getPopulation().charAt(0))) {
                if (Long.parseLong(planeta.getPopulation()) > poblacion) {
                    planetas[cont] = planeta;
                    cont++;
                }
            }
        }
        return getArraySinNulos(planetas, cont);
    }

    public Planet[] obtenerPlanetasConTerreno(String terreno){
        Planet[] planetas = new Planet[getPlanetas().length];
        short cont=0;
        short i;
        boolean encontrado;
        String cadenaAux;
        int cuentaTokens;
        for (Planet planeta : planets.obtenerTodos()){
            StringTokenizer token = new StringTokenizer(planeta.getTerrain(), ", ");
            cuentaTokens=token.countTokens();
            i=0;
            encontrado=false;
            do {
                cadenaAux=token.nextToken();
                if (cadenaAux.equalsIgnoreCase(terreno)){
                    planetas[cont]=planeta;
                    cont++;
                    encontrado=true;
                }
                i++;
            }while (i<cuentaTokens && !encontrado);
        }
        return getArraySinNulos(planetas, cont);
    }

    public Planet[] getArraySinNulos(Planet[] persoFinal, int comienzoNulos) {
        return Arrays.copyOfRange(persoFinal, 0, comienzoNulos);
    }

}
