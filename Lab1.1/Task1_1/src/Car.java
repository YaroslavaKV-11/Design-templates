import java.util.List;

public class Car {
    private List<Wheel> wheels;
    private Engine engine;

    public Car(List<Wheel> wheels, Engine engine) {
        this.wheels = wheels;
        this.engine = engine;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Car{wheels=" + wheels + ", engine=" + engine + "}";
    }
}