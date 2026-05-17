public class OtherVisitor implements Visitor {

    public void visit(ConcreteElement element) {
        System.out.println("OtherVisitor works with " + element.operation());
    }

    public void visit(OtherElement element) {
        System.out.println("OtherVisitor works with " + element.operation());
    }
}