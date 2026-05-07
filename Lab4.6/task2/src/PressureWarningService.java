public class PressureWarningService implements Observer {

    private final float minPressure;

    private final float maxPressure;

    public PressureWarningService() {
        this(730, 780);
    }

    public PressureWarningService(float minPressure, float maxPressure) {
        this.minPressure = minPressure;
        this.maxPressure = maxPressure;
    }

    public void update(WeatherEvent weatherEvent) {
        if (weatherEvent.getPressure() < minPressure || weatherEvent.getPressure() > maxPressure) {
            System.out.println("Pressure warning: city: " + weatherEvent.getLocation()
                    + ", pressure = " + weatherEvent.getPressure());
        }
    }
}