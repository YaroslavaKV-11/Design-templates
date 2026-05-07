public class ModerationState implements State {

    public void publish(Document document, String user) {
        document.setState(new PublishedState());
        System.out.println("Document is published");
    }

    public void abandon(Document document, String user) {
        document.setState(new DraftState());
        System.out.println("Document is returned to draft");
    }
}