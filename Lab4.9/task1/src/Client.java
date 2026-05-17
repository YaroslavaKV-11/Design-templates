import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<Element> elements = new ArrayList<>();

        elements.add(new ConcreteElement());
        elements.add(new OtherElement());

        Visitor concreteVisitor = new ConcreteVisitor();

        for (Element element : elements) {
            element.accept(concreteVisitor);
        }

        Visitor otherVisitor = new OtherVisitor();

        for (Element element : elements) {
            element.accept(otherVisitor);
        }
    }
}