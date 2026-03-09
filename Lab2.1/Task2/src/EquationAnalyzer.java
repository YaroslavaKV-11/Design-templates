import java.util.ArrayList;
import java.util.List;

public class EquationAnalyzer {

    public static void analyze(List<Equation> equations) {
        List<Equation> zeroSolutions = new ArrayList<>();
        List<Equation> oneSolution = new ArrayList<>();
        List<Equation> twoSolutions = new ArrayList<>();
        List<Equation> threeSolutions = new ArrayList<>();
        List<Equation> fourSolutions = new ArrayList<>();
        List<Equation> infiniteSolutions = new ArrayList<>();

        Equation minSingleEquation = null;
        Equation maxSingleEquation = null;
        double minSingleValue = Double.POSITIVE_INFINITY;
        double maxSingleValue = Double.NEGATIVE_INFINITY;

        for (Equation equation : equations) {
            List<Double> solutions = equation.solve();

            if (solutions.size() == 1 && solutions.get(0).equals(Double.POSITIVE_INFINITY)) {
                infiniteSolutions.add(equation);
            } else if (solutions.size() == 0) {
                zeroSolutions.add(equation);
            } else if (solutions.size() == 1) {
                oneSolution.add(equation);

                double value = solutions.get(0);

                if (value < minSingleValue) {
                    minSingleValue = value;
                    minSingleEquation = equation;
                }

                if (value > maxSingleValue) {
                    maxSingleValue = value;
                    maxSingleEquation = equation;
                }
            } else if (solutions.size() == 2) {
                twoSolutions.add(equation);
            } else if (solutions.size() == 3) {
                threeSolutions.add(equation);
            } else if (solutions.size() == 4) {
                fourSolutions.add(equation);
            }
        }

        printGroup("No solutions", zeroSolutions);
        printGroup("One solution", oneSolution);
        printGroup("Two solutions", twoSolutions);
        printGroup("Three solutions", threeSolutions);
        printGroup("Four solutions", fourSolutions);
        printGroup("Infinite number of solutions", infiniteSolutions);

        if (minSingleEquation != null) {
            System.out.println("Equation with smallest single solution: "
                    + minSingleEquation.coefficientsToString()
                    + " -> " + minSingleValue);
        }

        if (maxSingleEquation != null) {
            System.out.println("Equation with largest single solution: "
                    + maxSingleEquation.coefficientsToString()
                    + " -> " + maxSingleValue);
        }
    }

    private static void printGroup(String title, List<Equation> equations) {
        System.out.println(title + ":");
        for (Equation equation : equations) {
            System.out.println("  " + equation.coefficientsToString() + " -> " + equation.solve());
        }
        System.out.println();
    }
}