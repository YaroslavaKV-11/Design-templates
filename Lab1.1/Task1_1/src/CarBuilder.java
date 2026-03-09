import java.util.ArrayList;
import java.util.List;

public class CarBuilder {
    private Engine engine;
    private List<Wheel> wheels = new ArrayList<>();

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void addWheel(Wheel wheel) {
        wheels.add(wheel);
    }

    public Car build() {
        return new Car(wheels, engine);
    }
}