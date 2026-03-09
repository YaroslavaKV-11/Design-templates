import java.util.ArrayList;
import java.util.List;

public class LinearEquation extends Equation {

    public LinearEquation(double[] coefficients) {
        super(coefficients);
    }

    @Override
    public List<Double> solve() {
        List<Double> solutions = new ArrayList<>();

        double b = coefficients[0];
        double c = coefficients[1];

        if (b == 0) {
            if (c == 0) {
                solutions.add(Double.POSITIVE_INFINITY); 
            }
        } else {
            solutions.add(-c / b);
        }

        return solutions;
    }
}