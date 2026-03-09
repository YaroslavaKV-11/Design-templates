import java.util.List;

public abstract class Equation {
    protected double[] coefficients;

    public Equation(double[] coefficients) {
        this.coefficients = coefficients;
    }

    public abstract List<Double> solve();

    public String coefficientsToString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < coefficients.length; i++) {
            sb.append(coefficients[i]);
            if (i < coefficients.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}