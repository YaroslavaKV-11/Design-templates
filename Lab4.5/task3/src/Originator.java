public class Originator {

    /**
     * Цей параметр моделює стан нашого об'єкту
     */
    private String state = "";

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
        this.state += toUpdate;
    }

    public Memento saveState() {
        return new StateMemento(state);
    }

    public interface Memento {
        void restore();
    }

    private class StateMemento implements Memento {

        private final String state;

        public StateMemento(String state) {
            this.state = state;
        }

        public void restore() {
            Originator.this.state = state;
        }
    }
}