public class PostWordDecorator extends StringDecorator {
    private final String word;

    public PostWordDecorator(Printable printable, String word) {
        super(printable);
        this.word = word;
    }

    @Override
    public String getText() {
        return printable.getText() + word;
    }
}