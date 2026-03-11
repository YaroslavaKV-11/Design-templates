public class Car {
    public enum CarColor {
        White,
        Black,
        Red,
        Grey,
        Blue
    }

    public enum Type {
        Sedan,
        Hatchback,
        SUV
    }

    final private Type type;
    final private CarColor carColor;
    final private Engine engine;
    final private Wheel wheel;
    final private Transmission transmission;
    final private Tire tire;

    public Car(Type type,
               CarColor carColor,
               Engine engine,
               Wheel wheel,
               Transmission transmission,
               Tire tire) {
        this.type = type;
        this.carColor = carColor;
        this.engine = engine;
        this.wheel = wheel;
        this.transmission = transmission;
        this.tire = tire;
    }

    @Override
    public String toString() {
        return "Car:\n" +
                "type=" + type +
                ",\ncarColor=" + carColor +
                ",\nengine=" + engine +
                ",\nwheel=" + wheel +
                ",\ntransmission=" + transmission +
                ",\ntire=" + tire +
                '\n';
    }
}