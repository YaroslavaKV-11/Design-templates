public class MultiplyHandler extends OperationHandler {
    @Override
    public void handle(OperationRequest request) {
        if (request.getType() == OperationRequest.Type.MULTIPLY) {
            double result = request.getFirstNumber() * request.getSecondNumber();
            System.out.println(request.getFirstNumber() + " * " + request.getSecondNumber() + " = " + result);
        } else {
            super.handle(request);
        }
    }
}