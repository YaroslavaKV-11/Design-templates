public class EquationFactory {

    public static Equation createEquation(double[] coefficients) {
        if (coefficients.length == 2) {
            return new LinearEquation(coefficients);
        } else if (coefficients.length == 3) {
            return new QuadraticEquation(coefficients);
        } else if (coefficients.length == 5) {
            return new BiQuadraticEquation(coefficients);
        } else {
            throw new IllegalArgumentException("Unsupported number of coefficients");
        }
    }
}