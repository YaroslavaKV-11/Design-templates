public class UniversalOffCommand implements Command {
    private final Device[] devices;

    public UniversalOffCommand(Device[] devices) {
        this.devices = devices;
    }

    @Override
    public void execute() {
        for (Device device : devices) {
            device.off();
        }
    }
}