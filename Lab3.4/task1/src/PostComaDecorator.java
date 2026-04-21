public class PostComaDecorator extends StringDecorator {
    public PostComaDecorator(Printable printable) {
        super(printable);
    }

    @Override
    public String getText() {
        return printable.getText() + ",";
    }
}