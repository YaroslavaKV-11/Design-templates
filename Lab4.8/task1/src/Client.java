public class Client {

    public static void main(String[] args) {
        Strategy strategy = new ConcreteStrategy();

        Context context = new Context(strategy);

        context.doSomething();

        context.setStrategy(new OtherStrategy());

        context.doSomething();
    }
}