public class ConcreteIterator implements Iterator {
    private final ConcreteAggregate aggregate;
    private int position = 0;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public boolean hasNext() {
        return position < aggregate.size();
    }

    @Override
    public Element next() {
        return aggregate.get(position++);
    }
}