import java.util.ArrayList;
import java.util.List;

public class Originator {

    /**
     * Цей параметр моделює стан нашого об'єкту
     */
    private String state = "";

    private final List<Memento> history = new ArrayList<>();

    // Технічні методи встановлення та друкування стану

    /**
     * Виводить стан об'єкту в консоль
     */
    public void printState() {
        System.out.println(state);
    }

    /**
     * Оновлює стан конкатенуючи до поточного стану заданий рядок
     * @param toUpdate параметр, що додається до об'єкту
     */
    public void updateState(String toUpdate) {
        saveState();
        this.state += toUpdate;
    }

    public void undo() {
        if (history.isEmpty()) {
            return;
        }

        Memento memento = history.remove(history.size() - 1);
        this.state = memento.getState();
    }

    private void saveState() {
        history.add(new Memento(state));
    }

    private class Memento {

        private final String state;

        public Memento(String state) {
            this.state = state;
        }

        public String getState() {
            return state;
        }
    }
}