public class Client {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        Controller controller = new Controller();

        controller.setOnCommand(new LightOnCommand(lamp));
        controller.setOffCommand(new LightOffCommand(lamp));

        // Simulation
        controller.on();
        controller.on();
        controller.off();
        controller.off();
        controller.on();
        controller.on();
        controller.off();
    }
}