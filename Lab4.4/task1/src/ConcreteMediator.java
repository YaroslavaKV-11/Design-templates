public class ConcreteMediator implements Mediator {
    private ConcreteColleague1 colleague1;
    private ConcreteColleague2 colleague2;

    public void setColleague1(ConcreteColleague1 colleague1) {
        this.colleague1 = colleague1;
    }

    public void setColleague2(ConcreteColleague2 colleague2) {
        this.colleague2 = colleague2;
    }

    @Override
    public void notify(Colleague sender, String event) {
        if (sender == colleague1 && event.equals("A")) {
            System.out.println("Mediator reacts on event A and triggers colleague2.");
            colleague2.doB();
        }

        if (sender == colleague2 && event.equals("B")) {
            System.out.println("Mediator reacts on event B and triggers colleague1.");
            colleague1.doA();
        }
    }
}