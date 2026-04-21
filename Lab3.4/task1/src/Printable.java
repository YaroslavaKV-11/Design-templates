public interface Printable {
    String getText();

    default void print() {
        System.out.print(getText());
    }
}