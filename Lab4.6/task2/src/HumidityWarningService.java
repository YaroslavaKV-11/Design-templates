public class HumidityWarningService implements Observer {

    private final float minHumidity;

    private final float maxHumidity;

    public HumidityWarningService() {
        this(30, 80);
    }

    public HumidityWarningService(float minHumidity, float maxHumidity) {
        this.minHumidity = minHumidity;
        this.maxHumidity = maxHumidity;
    }

    public void update(WeatherEvent weatherEvent) {
        if (weatherEvent.getHumidity() < minHumidity || weatherEvent.getHumidity() > maxHumidity) {
            System.out.println("Humidity warning: city: " + weatherEvent.getLocation()
                    + ", humidity = " + weatherEvent.getHumidity());
        }
    }
}