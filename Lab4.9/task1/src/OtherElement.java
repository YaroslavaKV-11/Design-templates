public class OtherElement implements Element {

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operation() {
        return "OtherElement";
    }
}