import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 3, 3);
        List<Triangle.Memento> history = new ArrayList<>();

        history.add(triangle.saveState());

        String[] edges = {
                "b",
                "c",
                "a",
                "c",
                "b",
        };

        float[] values = {
                4,
                5,
                4,
                2,
                3,
        };

        for (int index = 0; index < edges.length; index++) {
            switch (edges[index]) {
                case "a":
                    triangle.setA(values[index]);
                    break;
                case "b":
                    triangle.setB(values[index]);
                    break;
                case "c":
                    triangle.setC(values[index]);
                    break;
            }

            history.add(triangle.saveState());

            System.out.println("Square = " + triangle.square());
        }

        Triangle.Memento maxSquareMemento = findMaxSquareMemento(triangle, history);
        triangle.restoreState(maxSquareMemento);

        System.out.println("Max square triangle:");
        triangle.printState();
        System.out.println("Square = " + triangle.square());
    }

    private static Triangle.Memento findMaxSquareMemento(Triangle triangle, List<Triangle.Memento> history) {
        Triangle.Memento maxMemento = history.get(0);

        for (Triangle.Memento memento : history) {
            if (triangle.square(memento) > triangle.square(maxMemento)) {
                maxMemento = memento;
            }
        }

        return maxMemento;
    }
}