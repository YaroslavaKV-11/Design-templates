import java.util.ArrayList;
import java.util.List;

public class WeatherDataCenter implements Subject {

    final private WeatherReader weatherReader;

    private final List<Observer> observers = new ArrayList<>();

    public WeatherDataCenter() {
        weatherReader = new WeatherReader("resources/input01.txt");
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(WeatherEvent weatherEvent) {
        for (Observer observer : observers) {
            observer.update(weatherEvent);
        }
    }

    public boolean update() {
        WeatherEvent weatherEvent = weatherReader.getEvent();

        if (weatherEvent == null) {
            return false;
        }

        if (weatherEvent.getLocation().equals("end")) {
            return true;
        }

        System.out.println("Update data: city: " + weatherEvent.getLocation()
                + ", temperature = " + weatherEvent.getTemperature()
                + ", humidity = " + weatherEvent.getHumidity()
                + ", pressure = " + weatherEvent.getPressure());

        notifyObservers(weatherEvent);

        return false;
    }
}