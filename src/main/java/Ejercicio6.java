import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio6 {

    public Planets planets;

    public Ejercicio6() {
        planets = new Planets(ObtenerPlanetsRequest.Companion.get().getResults());
    }

    public Planet[] getPlanetas(){
        return planets.obtenerTodos();
    }

    public Planet[] obtenerMasPobladosQue(int poblacion){
        Planet[] planetas = new Planet[getPlanetas().length];
        short cont=0;
        for (Planet planeta : planets.obtenerTodos()){
            if (Integer.parseInt(planeta.getPopulation())>poblacion){
                planetas[cont]=planeta;
                cont++;
            }
        }
        return getArraySinNulos(planetas, cont);
    }

    public Planet[] getArraySinNulos(Planet[] persoFinal, int comienzoNulos) {
        return Arrays.copyOfRange(persoFinal, 0, comienzoNulos);
    }

}
