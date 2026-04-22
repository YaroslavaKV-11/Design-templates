public class ConcreteColleague1 extends Colleague {
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void send() {
        System.out.println("Colleague1 sends event A");
        mediator.notify(this, "A");
    }

    public void doA() {
        System.out.println("Colleague1 performs action A");
    }
}