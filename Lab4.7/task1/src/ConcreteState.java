public class ConcreteState implements State {

    public void action1(Context context) {
        System.out.println("ConcreteState: action1");

        State state = new OtherState();
        context.setState(state);
    }

    public void action2(Context context) {
        System.out.println("ConcreteState: action2");
    }
}