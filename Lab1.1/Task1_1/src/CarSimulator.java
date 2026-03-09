public class CarSimulator {
    private CarBuilder carBuilder;
    private Car car;

    public CarSimulator(CarBuilder carBuilder, Car car) {
        this.carBuilder = carBuilder;
        this.car = car;
    }

    public void simulate() {
        System.out.println("Simulation started");
        System.out.println("Car: " + car);
        System.out.println("Simulation finished");
    }
}