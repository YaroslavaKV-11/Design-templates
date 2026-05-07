public class Fan {

    private State state = new LowState();

    public void setState(State state) {
        this.state = state;
    }

    public void turnUp() {
        state.turnUp(this);
    }

    public void turnDown() {
        state.turnDown(this);
    }
}