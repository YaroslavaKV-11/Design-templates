public class ConcreteElement implements Element {

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operation() {
        return "ConcreteElement";
    }
}