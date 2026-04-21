public class PostExclaimDecorator extends StringDecorator {
    public PostExclaimDecorator(Printable printable) {
        super(printable);
    }

    @Override
    public String getText() {
        return printable.getText() + "!";
    }
}