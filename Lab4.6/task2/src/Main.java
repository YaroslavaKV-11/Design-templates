public class Main {

    public static void main(String[] args) {
        WeatherDataCenter dataCenter = new WeatherDataCenter();

        dataCenter.attach(new TemperatureWarningService());
        dataCenter.attach(new HumidityWarningService());
        dataCenter.attach(new PressureWarningService());

        while (true) { // main loop
            if (dataCenter.update()) {
                break;
            }
        }

        System.out.println("Finish of the simulation.");
    }
}