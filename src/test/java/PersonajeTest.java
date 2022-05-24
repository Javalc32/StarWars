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

    @Test
    public void test2(){
        // TODO Haz la función en la clase Ejercicio6: obtenerMasPobladosQue(long poblacion)
        //  nos devuelve una lista de aquellos planetas que tienen más población que el long pasado por parámetro
        // TODO Haz todos los test que sean necesarios.
        // tip: Si el planeta tiene una población indeterminada, no debe mostrarse
        //caso menos poblacion que todos

        Assertions.assertEquals(8, ej.obtenerMasPobladosQue(10).length);
    }

    @Test
    public void test3(){
        // obtenerMasPbladosQue (caso medio)

        Assertions.assertEquals(7, ej.obtenerMasPobladosQue(1001).length);
    }

    @Test
    public void test4(){
        // obtenerMasPbladosQue (caso mas poblacion que todos)

        Assertions.assertEquals(0, ej.obtenerMasPobladosQue(10000000000000L).length);
    }

    // TODO Haz la función en la clase Ejercicio6: obtenerPlanetasConTerreno(String terreno)
    //  nos devuelve una lista de aquellos planetas que tienen terrenos que se llamen como el string.
    // tip: Algunos terrenos disponibles: forests, mountains, hills, etc.
    // TODO Haz todos los test que sean necesarios.
    // tip: Si el planeta tiene una población indeterminada, no debe mostrarse

    @Test
    public void test5(){
        //Test normal de la funcion
        Assertions.assertEquals(4, ej.obtenerPlanetasConTerreno("mountains").length);
    }

    @Test
    public void test6(){
        //Test cadena vacia
        Assertions.assertEquals(0, ej.obtenerPlanetasConTerreno("").length);
    }

    @Test
    public void test7(){
        //Test con terreno no existente
        Assertions.assertEquals(0, ej.obtenerPlanetasConTerreno("pacolandia").length);
    }



    // TODO Haz la función en la clase Ejercicio6: obtenerPlanetasResidentes(int residentes, String nombre)
    //  nos devuelve una lista de aquellos planetas que tienen más residentes que la variable "residentes" y que su nombre contenga el String "nombre"
    // tip: cada residente es represetnado por una url, solo tienes que contar. Ej si residents=[https://swapi.dev/api/people/3/, https://swapi.dev/api/people/21/] el resultado será 2
    // TODO Haz todos los test que sean necesarios.
    // tip: Si el planeta tiene una población indeterminada, no debe mostrarse

    @Test
    public void test8(){
        //Comprobacion de funcion normal

        Assertions.assertEquals(2, ej.obtenerPlanetasResidentes(5, "oo").length);
    }

    @Test
    public void test9(){
        //Comprobacion con residente 0 y cadena vacia

        Assertions.assertEquals(7, ej.obtenerPlanetasResidentes(0, "").length);
    }

    @Test
    public void test10(){
        //Comprobacion con cadena igual que el nombre de un planeta con poblacion unknown

        Assertions.assertEquals(0, ej.obtenerPlanetasResidentes(0, "Dagobah").length);
    }
}
