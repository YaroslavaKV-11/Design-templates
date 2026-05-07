import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReader implements Subject {

    private final String filePath;

    private final List<Observer> observers = new ArrayList<>();

    public FileReader(String filePath) {
        this.filePath = filePath;
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String line) {
        for (Observer observer : observers) {
            observer.update(line);
        }
    }

    public void read() {
        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(filePath))) {
            reader.lines().forEach(this::onLineRead);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void onLineRead(String line) {
        notifyObservers(line);
    }
}