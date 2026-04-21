public abstract class StringDecorator implements Printable {
    protected final Printable printable;

    public StringDecorator(Printable printable) {
        this.printable = printable;
    }
}