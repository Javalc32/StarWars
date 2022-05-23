public class Prueba {
    public static void main(String[] args) {
        Ejercicio6 ej = new Ejercicio6();

        for (Planet planeta : ej.getPlanetas()){
            System.out.println(planeta.getPopulation());
        }
    }
}
