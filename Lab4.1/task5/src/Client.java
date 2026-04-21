public class Client {
    public static void main(String[] args) {
        OperationRequest[] requests = {
                new OperationRequest(10, 5, OperationRequest.Type.ADD),
                new OperationRequest(10, 5, OperationRequest.Type.SUBTRACT),
                new OperationRequest(10, 5, OperationRequest.Type.MULTIPLY),
                new OperationRequest(10, 5, OperationRequest.Type.DIVIDE),
                new OperationRequest(10, 0, OperationRequest.Type.DIVIDE),
        };

        OperationHandler addHandler = new AddHandler();
        OperationHandler subtractHandler = new SubtractHandler();
        OperationHandler multiplyHandler = new MultiplyHandler();
        OperationHandler divideHandler = new DivideHandler();

        addHandler
                .setNext(subtractHandler)
                .setNext(multiplyHandler)
                .setNext(divideHandler);

        for (OperationRequest request : requests) {
            addHandler.handle(request);
        }
    }
}