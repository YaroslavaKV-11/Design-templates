public abstract class Beverage {
    protected final int sugar;
    protected final Serving serving;

    public Beverage(int sugar, Serving serving) {
        this.sugar = sugar;
        this.serving = serving;
    }

    public abstract void prepare();
    public abstract void drink();
    public abstract int cost();
    public abstract String getName();
}