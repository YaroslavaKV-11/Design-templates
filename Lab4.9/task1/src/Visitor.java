public interface Visitor {

    void visit(ConcreteElement element);

    void visit(OtherElement element);
}