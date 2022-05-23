import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonajeTest {


    Ejercicio6 ej = new Ejercicio6();

    @Test
    public void test1(){
        // TODO Haz una función que te devuelva un array compuesto por:
        //  Todos los planetas.
        // tip: ej.planets.obtenerTodos()
        // TODO comprueba que tu función devuelve el número correcto de elementos
        // tip: es 10

        Assertions.assertEquals(10, ej.getPlanetas().length);
    }

    // TODO Haz la función en la clase Ejercicio6: obtenerMasPobladosQue(int poblacion)
    //  nos devuelve una lista de aquellos planetas que tienen más población que el integer pasado por parámetro
    // TODO Haz todos los test que sean necesarios.
    // tip: Si el planeta tiene una población indeterminada, no debe mostrarse


    // TODO Haz la función en la clase Ejercicio6: obtenerPlanetasConTerreno(String terreno)
    //  nos devuelve una lista de aquellos planetas que tienen terrenos que se llamen como el string.
    // tip: Algunos terrenos disponibles: forests, mountains, hills, etc.
    // TODO Haz todos los test que sean necesarios.
    // tip: Si el planeta tiene una población indeterminada, no debe mostrarse


    // TODO Haz la función en la clase Ejercicio6: obtenerPlanetasResidentes(int residentes, String nombre)
    //  nos devuelve una lista de aquellos planetas que tienen más residentes que la variable "residentes" y que su nombre contenga el String "nombre"
    // tip: cada residente es represetnado por una url, solo tienes que contar. Ej si residents=[https://swapi.dev/api/people/3/, https://swapi.dev/api/people/21/] el resultado será 2
    // TODO Haz todos los test que sean necesarios.
    // tip: Si el planeta tiene una población indeterminada, no debe mostrarse
}
