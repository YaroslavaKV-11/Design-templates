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
    }
}