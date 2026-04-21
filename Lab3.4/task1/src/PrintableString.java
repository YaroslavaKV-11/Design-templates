public class PrintableString implements Printable {
    private final String text;

    public PrintableString(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }
}