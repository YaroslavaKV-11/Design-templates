public class ConcreteColleague2 extends Colleague {
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void send() {
        System.out.println("Colleague2 sends event B");
        mediator.notify(this, "B");
    }

    public void doB() {
        System.out.println("Colleague2 performs action B");
    }
}