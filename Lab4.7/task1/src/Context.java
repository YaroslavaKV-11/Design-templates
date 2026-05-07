public class Context {

    private State state;

    public Context(State initialState) {
        this.state = initialState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void action1() {
        state.action1(this);
    }

    public void action2() {
        state.action2(this);
    }
}