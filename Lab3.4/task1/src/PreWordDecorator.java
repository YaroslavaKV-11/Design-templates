public class PreWordDecorator extends StringDecorator {
    private final String word;

    public PreWordDecorator(Printable printable, String word) {
        super(printable);
        this.word = word;
    }

    @Override
    public String getText() {
        return word + printable.getText();
    }
}