public class Main {
    public static void main(String[] args) {
        Wheel wheel1 = new Wheel(17);
        Wheel wheel2 = new Wheel(17);
        Wheel wheel3 = new Wheel(17);
        Wheel wheel4 = new Wheel(17);

        Engine engine = new Engine(150);

        CarBuilder builder = new CarBuilder();
        builder.setEngine(engine);
        builder.addWheel(wheel1);
        builder.addWheel(wheel2);
        builder.addWheel(wheel3);
        builder.addWheel(wheel4);

        Car car = builder.build();

        CarSimulator simulator = new CarSimulator(builder, car);
        simulator.simulate();
    }
}