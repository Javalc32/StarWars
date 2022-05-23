public class Ejercicio6 {

    public Planets planets;

    public Ejercicio6() {
        planets = new Planets(ObtenerPlanetsRequest.Companion.get().getResults());
    }

    public Planet[] getPlanetas(){
        return planets.obtenerTodos();
    }

}
