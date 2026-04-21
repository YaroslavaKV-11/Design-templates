public abstract class RequestHandler {
    protected RequestHandler next;

    public RequestHandler setNext(RequestHandler next) {
        this.next = next;
        return next;
    }

    public void handle(Request request) {
        if (next != null) {
            next.handle(request);
        } else {
            System.out.println("Unhandled request " + request);
        }
    }
}