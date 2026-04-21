public class Client {
    public static void main(String[] args) {
        Lamp kitchenLamp = new Lamp("Kitchen");
        Lamp hallLamp = new Lamp("Hall");
        Lamp bedroomLamp = new Lamp("Bedroom");
        Lamp bathroomLamp = new Lamp("Bathroom");

        Controller controllerKitchenLamp = new Controller();
        Controller controllerHallLamp = new Controller();
        Controller controllerBedroomLamp = new Controller();
        Controller controllerBathroomLamp = new Controller();
        Controller controllerUniversal = new Controller();

        controllerKitchenLamp.setOnCommand(new LightOnCommand(kitchenLamp));
        controllerKitchenLamp.setOffCommand(new LightOffCommand(kitchenLamp));

        controllerHallLamp.setOnCommand(new LightOnCommand(hallLamp));
        controllerHallLamp.setOffCommand(new LightOffCommand(hallLamp));

        controllerBedroomLamp.setOnCommand(new LightOnCommand(bedroomLamp));
        controllerBedroomLamp.setOffCommand(new LightOffCommand(bedroomLamp));

        controllerBathroomLamp.setOnCommand(new LightOnCommand(bathroomLamp));
        controllerBathroomLamp.setOffCommand(new LightOffCommand(bathroomLamp));

        controllerUniversal.setOffCommand(new UniversalLightOffCommand(
                new Lamp[]{kitchenLamp, hallLamp, bedroomLamp, bathroomLamp}
        ));

        // Simulation
        controllerKitchenLamp.on();
        controllerHallLamp.on();
        controllerBedroomLamp.on();

        controllerKitchenLamp.off();
        controllerHallLamp.off();
        controllerBedroomLamp.off();

        controllerBedroomLamp.on();
        controllerBathroomLamp.on();
        controllerUniversal.off();
    }
}