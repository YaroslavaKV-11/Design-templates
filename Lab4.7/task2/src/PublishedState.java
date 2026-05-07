public class PublishedState implements State {

    public void publish(Document document, String user) {
        System.out.println("Document is already published");
    }

    public void abandon(Document document, String user) {
        document.setState(new DraftState());
        System.out.println("Document is returned to draft");
    }
}