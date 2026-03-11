public class Director {
    private static Director instance;

    private Director() {
    }

    public static Director getInstance() {
        if (instance == null) {
            instance = new Director();
        }
        return instance;
    }

    public Car buildSedan() {
        Engine engine = new EngineBuilder()
                .setPower(110)
                .setTorque(150)
                .setFuel(Engine.Fuel.Petrol)
                .setVolume(1.6f)
                .build();

        Wheel wheel = new WheelBuilder()
                .setMaterial(Wheel.Material.Steel)
                .setDiameter(15)
                .build();

        Transmission transmission = new TransmissionBuilder()
                .setType(Transmission.Type.Manual)
                .setGears(5)
                .build();

        Tire tire = new TireBuilder()
                .setSeason(Tire.Season.Summer)
                .setBrand("Michelin")
                .build();

        return new CarBuilder()
                .setType(Car.Type.Sedan)
                .setCarColor(Car.CarColor.White)
                .setEngine(engine)
                .setWheel(wheel)
                .setTransmission(transmission)
                .setTire(tire)
                .build();
    }

    public Car buildHatchback() {
        Engine engine = new EngineBuilder()
                .setPower(95)
                .setTorque(130)
                .setFuel(Engine.Fuel.Petrol)
                .setVolume(1.4f)
                .build();

        Wheel wheel = new WheelBuilder()
                .setMaterial(Wheel.Material.Alloy)
                .setDiameter(16)
                .build();

        Transmission transmission = new TransmissionBuilder()
                .setType(Transmission.Type.Manual)
                .setGears(5)
                .build();

        Tire tire = new TireBuilder()
                .setSeason(Tire.Season.AllSeason)
                .setBrand("Goodyear")
                .build();

        return new CarBuilder()
                .setType(Car.Type.Hatchback)
                .setCarColor(Car.CarColor.Red)
                .setEngine(engine)
                .setWheel(wheel)
                .setTransmission(transmission)
                .setTire(tire)
                .build();
    }

    public Car buildSUV() {
        Engine engine = new EngineBuilder()
                .setPower(180)
                .setTorque(320)
                .setFuel(Engine.Fuel.Diesel)
                .setVolume(2.2f)
                .build();

        Wheel wheel = new WheelBuilder()
                .setMaterial(Wheel.Material.Forged)
                .setDiameter(18)
                .build();

        Transmission transmission = new TransmissionBuilder()
                .setType(Transmission.Type.Automatic)
                .setGears(6)
                .build();

        Tire tire = new TireBuilder()
                .setSeason(Tire.Season.Winter)
                .setBrand("Continental")
                .build();

        return new CarBuilder()
                .setType(Car.Type.SUV)
                .setCarColor(Car.CarColor.Black)
                .setEngine(engine)
                .setWheel(wheel)
                .setTransmission(transmission)
                .setTire(tire)
                .build();
    }

    public Car buildElectricSUV() {
        Engine engine = new EngineBuilder()
                .setPower(220)
                .setTorque(400)
                .setFuel(Engine.Fuel.Electric)
                .setVolume(0.0f)
                .build();

        Wheel wheel = new WheelBuilder()
                .setMaterial(Wheel.Material.Alloy)
                .setDiameter(19)
                .build();

        Transmission transmission = new TransmissionBuilder()
                .setType(Transmission.Type.Automatic)
                .setGears(1)
                .build();

        Tire tire = new TireBuilder()
                .setSeason(Tire.Season.AllSeason)
                .setBrand("Pirelli")
                .build();

        return new CarBuilder()
                .setType(Car.Type.SUV)
                .setCarColor(Car.CarColor.Blue)
                .setEngine(engine)
                .setWheel(wheel)
                .setTransmission(transmission)
                .setTire(tire)
                .build();
    }
}