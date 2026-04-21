public abstract class OperationHandler {
    protected OperationHandler next;

    public OperationHandler setNext(OperationHandler next) {
        this.next = next;
        return next;
    }

    public void handle(OperationRequest request) {
        if (next != null) {
            next.handle(request);
        } else {
            System.out.println("Operation is not supported.");
        }
    }
}