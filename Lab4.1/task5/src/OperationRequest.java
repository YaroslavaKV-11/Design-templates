public class OperationRequest {
    public enum Type {
        ADD,
        SUBTRACT,
        MULTIPLY,
        DIVIDE
    }

    private final double firstNumber;
    private final double secondNumber;
    private final Type type;

    public OperationRequest(double firstNumber, double secondNumber, Type type) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.type = type;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public Type getType() {
        return type;
    }
}