public class Main {

    public static void main(String[] args) {
        AbstractClass concreteClass = new ConcreteClass();

        concreteClass.templateMethod();

        AbstractClass otherClass = new OtherClass();

        otherClass.templateMethod();
    }
}