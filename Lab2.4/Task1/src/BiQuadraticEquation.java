import java.util.ArrayList;
import java.util.List;

public class BiQuadraticEquation extends Equation {

    public BiQuadraticEquation(double[] coefficients) {
        super(coefficients);
    }

    @Override
    public List<Double> solve() {
        List<Double> solutions = new ArrayList<>();

        double a = coefficients[0];
        double b = coefficients[2];
        double c = coefficients[4];

        if (a == 0) {
            QuadraticEquation quadratic = new QuadraticEquation(new double[]{b, 0, c});
            return quadratic.solve();
        }

        double d = b * b - 4 * a * c;

        if (d < 0) {
            return solutions;
        }

        double y1 = (-b - Math.sqrt(d)) / (2 * a);
        double y2 = (-b + Math.sqrt(d)) / (2 * a);

        addXSolutionsFromY(y1, solutions);
        addXSolutionsFromY(y2, solutions);

        return removeDuplicates(solutions);
    }

    private void addXSolutionsFromY(double y, List<Double> solutions) {
        if (y > 0) {
            solutions.add(-Math.sqrt(y));
            solutions.add(Math.sqrt(y));
        } else if (y == 0) {
            solutions.add(0.0);
        }
    }

    private List<Double> removeDuplicates(List<Double> solutions) {
        List<Double> result = new ArrayList<>();

        for (Double value : solutions) {
            boolean exists = false;
            for (Double saved : result) {
                if (Math.abs(saved - value) < 0.000001) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                result.add(value);
            }
        }

        return result;
    }

    @Override
    public Equation copy() {
        return new BiQuadraticEquation(coefficients.clone());
    }
}