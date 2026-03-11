public class Car implements Prototype<Car> {
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

    public Engine getEngine() {
        return engine;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public Tire getTire() {
        return tire;
    }

    @Override
    public Car copy() {
        return new Car(
                type,
                carColor,
                engine.copy(),
                wheel.copy(),
                transmission.copy(),
                tire.copy()
        );
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