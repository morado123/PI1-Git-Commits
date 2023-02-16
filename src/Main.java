import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Imprimir mensaje de bienvenida
        System.out.println("Hello world!");

        // Crear una lista de objetos 'Car'
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            // Añadir autos a la lista con un valor booleano y el índice como número de cilindros
            cars.add(new Car(true, i));
        }

        // Imprimir un mensaje adicional
        System.out.println("Ahh");
    }
}
