public class ConcreteVisitor implements Visitor {

    public void visit(ConcreteElement element) {
        System.out.println("ConcreteVisitor works with " + element.operation());
    }

    public void visit(OtherElement element) {
        System.out.println("ConcreteVisitor works with " + element.operation());
    }
}