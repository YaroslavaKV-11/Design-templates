import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 3, 3);
        List<Command> history = new ArrayList<>();

        String[] edges = {

                "b",

                "c",

                "a",

                "duplicateA",

                "c",

                "b",

                "halfA"

        };

        float[] values = {

                4,

                5,

                4,

                1, // "duplicateA",

                6,

                3,

                1, // "halfA"

        };

        for (int index = 0; index < edges.length; index++) {
            Command command = new TriangleCommand(triangle, edges[index], values[index]);

            command.execute();
            history.add(command);

            System.out.println("Square = " + triangle.square());
        }

        Triangle.Memento minSquareMemento = findMinSquareMemento(triangle, history);
        triangle.restoreState(minSquareMemento);

        System.out.println("Min square triangle:");
        triangle.printState();
        System.out.println("Square = " + triangle.square());
    }

    private static Triangle.Memento findMinSquareMemento(Triangle triangle, List<Command> history) {
        Triangle.Memento minMemento = history.get(0).getMemento();

        for (Command command : history) {
            if (triangle.square(command.getMemento()) < triangle.square(minMemento)) {
                minMemento = command.getMemento();
            }
        }

        return minMemento;
    }
}

interface Command {

    void execute();

    Triangle.Memento getMemento();
}

class TriangleCommand implements Command {

    private final Triangle triangle;

    private final String edge;

    private final float value;

    private Triangle.Memento memento;

    public TriangleCommand(Triangle triangle, String edge, float value) {
        this.triangle = triangle;
        this.edge = edge;
        this.value = value;
    }

    public void execute() {
        switch (edge) {
            case "a":
                triangle.setA(value);
                break;
            case "b":
                triangle.setB(value);
                break;
            case "c":
                triangle.setC(value);
                break;
            case "duplicateA":
                triangle.duplicateA();
                break;
            case "duplicateB":
                triangle.duplicateB();
                break;
            case "duplicateC":
                triangle.duplicateC();
                break;
            case "halfA":
                triangle.halfA();
                break;
            case "halfB":
                triangle.halfB();
                break;
            case "halfC":
                triangle.halfC();
                break;
        }

        memento = triangle.saveState();
    }

    public Triangle.Memento getMemento() {
        return memento;
    }
}