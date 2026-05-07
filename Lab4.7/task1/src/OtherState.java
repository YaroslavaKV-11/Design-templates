public class OtherState implements State {

    public void action1(Context context) {
        System.out.println("OtherState: action1");
    }

    public void action2(Context context) {
        System.out.println("OtherState: action2");

        State state = new ConcreteState();
        context.setState(state);
    }
}