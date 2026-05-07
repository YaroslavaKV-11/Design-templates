import java.util.ArrayList;
import java.util.List;

public class Triangle {

    private float a;

    private float b;

    private float c;

    private final List<Memento> history = new ArrayList<>();

    /**
     * Перевіряє чи існує трикутник з заданими сторонами
     *
     * @param a сторона трикутники
     * @param b сторона трикутники
     * @param c сторона трикутники
     * @return true, якщо такий трикутник існує, та false в іншому разі
     */
    public static boolean checkExistence(float a, float b, float c) {
        return a + b > c && a + c > b && b + c > a;
    }

    public Triangle(float a, float b, float c) {
        assert checkExistence(a, b, c);

        this.a = a;
        this.b = b;
        this.c = c;

        saveState();
    }

    /**
     * Встановлює сторону "a" трикутника
     *
     * @param a сторона трикутника
     */
    public void setA(float a) {
        if (checkExistence(a, b, c)) {
            this.a = a;
            saveState();
        } else {
            System.out.println("Error: value is not set");
        }
    }

    /**
     * Встановлює сторону "b" трикутника
     *
     * @param b сторона трикутника
     */
    public void setB(float b) {
        if (checkExistence(a, b, c)) {
            this.b = b;
            saveState();
        } else {
            System.out.println("Error: value is not set");
        }
    }

    /**
     * Встановлює сторону "c" трикутника
     *
     * @param c сторона трикутника
     */
    public void setC(float c) {
        if (checkExistence(a, b, c)) {
            this.c = c;
            saveState();
        } else {
            System.out.println("Error: value is not set");
        }
    }

    /**
     * Обчислює периметр трикутника
     *
     * @return периметр трикутника
     */
    public float perimeter() {
        return a + b + c;
    }

    /**
     * Обчислює площу трикутника
     *
     * @return площу трикутника
     */
    public float square() {
        return square(a, b, c);
    }

    public void restoreMaxSquareState() {
        if (history.isEmpty()) {
            return;
        }

        Memento maxMemento = history.get(0);

        for (Memento memento : history) {
            if (memento.square() > maxMemento.square()) {
                maxMemento = memento;
            }
        }

        restoreState(maxMemento);
    }

    public void printState() {
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
    }

    private void saveState() {
        history.add(new Memento(a, b, c));
    }

    private void restoreState(Memento memento) {
        this.a = memento.a;
        this.b = memento.b;
        this.c = memento.c;
    }

    private static float square(float a, float b, float c) {
        float p = (a + b + c) / 2;
        float s = p * (p - a) * (p - b) * (p - c);

        return (float) Math.sqrt(s);
    }

    private class Memento {

        private final float a;

        private final float b;

        private final float c;

        public Memento(float a, float b, float c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public float square() {
            return Triangle.square(a, b, c);
        }
    }
}