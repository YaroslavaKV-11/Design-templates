public class PostEndlDecorator extends StringDecorator {
    public PostEndlDecorator(Printable printable) {
        super(printable);
    }

    @Override
    public String getText() {
        return printable.getText() + "\n";
    }
}