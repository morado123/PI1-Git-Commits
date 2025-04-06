public class Car {

    private final boolean wheels;  // Conservar la inmutabilidad
    private final int cylinders;   // Conservar la inmutabilidad

    public Car(boolean wheels, int cylinders) {
        this.wheels = wheels;
        this.cylinders = cylinders;
    }

    public boolean isWheels() {
        return wheels;
    }

    public void setWheels(boolean wheels) {
        // Esto no tiene efecto porque la propiedad es `final`.
        // Podrías eliminar este método si prefieres que la propiedad sea inmutable.
    }

    public void setCylinders(int cylinders) {
        // Lo mismo aquí, ya que `cylinders` es `final`, este método no debería estar.
        // Podrías eliminarlo si prefieres que la propiedad sea inmutable.
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String toString() {
        return "Wheels: " + wheels + ", Cylinders: " + cylinders + "\n";
    }
}
