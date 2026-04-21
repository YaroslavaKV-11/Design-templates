import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate implements Aggregate {
    private final List<Element> elements = new ArrayList<>();

    public void add(Element element) {
        elements.add(element);
    }

    public int size() {
        return elements.size();
    }

    public Element get(int index) {
        return elements.get(index);
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }
}