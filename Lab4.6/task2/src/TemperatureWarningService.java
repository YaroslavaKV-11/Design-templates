public class TemperatureWarningService implements Observer {

    private final float minTemperature;

    private final float maxTemperature;

    public TemperatureWarningService() {
        this(-30, 35);
    }

    public TemperatureWarningService(float minTemperature, float maxTemperature) {
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
    }

    public void update(WeatherEvent weatherEvent) {
        if (weatherEvent.getTemperature() < minTemperature || weatherEvent.getTemperature() > maxTemperature) {
            System.out.println("Temperature warning: city: " + weatherEvent.getLocation()
                    + ", temperature = " + weatherEvent.getTemperature());
        }
    }
}