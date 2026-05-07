public class DraftState implements State {

    public void publish(Document document, String user) {
        if (user.equals("admin")) {
            document.setState(new PublishedState());
            System.out.println("Document is published");
        } else {
            document.setState(new ModerationState());
            System.out.println("Document is sent to moderation");
        }
    }

    public void abandon(Document document, String user) {
        System.out.println("Document is already draft");
    }
}