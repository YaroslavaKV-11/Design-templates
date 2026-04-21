public class UniversalLightOffCommand implements Command {
    private final Lamp[] lamps;

    public UniversalLightOffCommand(Lamp[] lamps) {
        this.lamps = lamps;
    }

    @Override
    public void execute() {
        for (Lamp lamp : lamps) {
            lamp.lightOff();
        }
    }
}