import java.util.ArrayList;
import java.util.List;

public class QuadraticEquation extends Equation {

    public QuadraticEquation(double[] coefficients) {
        super(coefficients);
    }

    @Override
    public List<Double> solve() {
        List<Double> solutions = new ArrayList<>();

        double a = coefficients[0];
        double b = coefficients[1];
        double c = coefficients[2];

        if (a == 0) {
            LinearEquation linear = new LinearEquation(new double[]{b, c});
            return linear.solve();
        }

        double d = b * b - 4 * a * c;

        if (d > 0) {
            double x1 = (-b - Math.sqrt(d)) / (2 * a);
            double x2 = (-b + Math.sqrt(d)) / (2 * a);
            solutions.add(x1);
            solutions.add(x2);
        } else if (d == 0) {
            solutions.add(-b / (2 * a));
        }

        return solutions;
    }
}