public class Document {

    private State state = new DraftState();

    public Document() {
    }

    public void publish(String user) {
        state.publish(this, user);
    }

    public void abandon(String user) {
        state.abandon(this, user);
    }

    public void setState(State state) {
        this.state = state;
    }

    // різні методи роботи з документом, що не
    // стосуються шаблону проектування Стан

    private String text = "";

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}