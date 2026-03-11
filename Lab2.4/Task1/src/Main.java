import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] files = {"input01.txt", "input02.txt", "input03.txt"};

        for (String fileName : files) {
            System.out.println("========== " + fileName + " ==========");

            List<Equation> equations = EquationReader.readEquationsFromFile(fileName);
            EquationAnalyzer.analyze(equations);

            System.out.println();
        }

        System.out.println("========== Prototype demonstration ==========");

        Equation original = new QuadraticEquation(new double[]{1, -5, 6});
        Equation copy = original.copy();

        System.out.println("Original: " + original.coefficientsToString());
        System.out.println("Copy: " + copy.coefficientsToString());
        System.out.println("Original solutions: " + original.solve());
        System.out.println("Copy solutions: " + copy.solve());
    }
}