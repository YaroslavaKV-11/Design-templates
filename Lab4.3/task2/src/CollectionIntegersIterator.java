import java.util.Iterator;
import java.util.List;

public class CollectionIntegersIterator implements Iterator<Integer> {
    private final List<Integer> array;
    private int position = 0;

    public CollectionIntegersIterator(List<Integer> array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return position < array.size();
    }

    @Override
    public Integer next() {
        return array.get(position++);
    }
}