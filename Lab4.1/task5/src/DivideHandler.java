public class DivideHandler extends OperationHandler {
    @Override
    public void handle(OperationRequest request) {
        if (request.getType() == OperationRequest.Type.DIVIDE) {
            if (request.getSecondNumber() == 0) {
                System.out.println("Division by zero is not allowed.");
            } else {
                double result = request.getFirstNumber() / request.getSecondNumber();
                System.out.println(request.getFirstNumber() + " / " + request.getSecondNumber() + " = " + result);
            }
        } else {
            super.handle(request);
        }
    }
}