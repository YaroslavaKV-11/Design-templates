import java.util.Iterator;
import java.util.Stack;

public class DepthFirstIterator implements Iterator<Component> {
    private final Stack<Component> stack = new Stack<>();

    public DepthFirstIterator(Component root) {
        stack.push(root);
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public Component next() {
        Component current = stack.pop();

        if (current instanceof Box) {
            java.util.List<Component> children = ((Box) current).getChildren();
            for (int i = children.size() - 1; i >= 0; i--) {
                stack.push(children.get(i));
            }
        }

        return current;
    }
}