import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        final Originator originator = new Originator();
        final List<Originator.Memento> history = new ArrayList<>();

        history.add(originator.saveState());
        originator.updateState("Hello");

        history.add(originator.saveState());
        originator.updateState(", ");

        history.add(originator.saveState());
        originator.updateState("World");

        history.add(originator.saveState());
        originator.updateState("!");

        originator.printState();
        undo(originator, history);

        originator.printState();
        undo(originator, history);

        originator.printState();
        undo(originator, history);

        originator.printState();
        undo(originator, history);

        originator.printState();
        undo(originator, history);

        originator.printState();
    }

    private static void undo(Originator originator, List<Originator.Memento> history) {
        if (history.isEmpty()) {
            return;
        }

        Originator.Memento memento = history.remove(history.size() - 1);
        originator.restoreState(memento);
    }
}