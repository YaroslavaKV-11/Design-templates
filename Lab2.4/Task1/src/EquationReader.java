import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EquationReader {

    public static List<Equation> readEquationsFromFile(String fileName) {
        List<Equation> equations = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(new File(fileName));

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();

                if (line.isEmpty()) {
                    continue;
                }

                String[] parts = line.split("\\s+");
                double[] coefficients = new double[parts.length];

                for (int i = 0; i < parts.length; i++) {
                    coefficients[i] = Double.parseDouble(parts[i]);
                }

                equations.add(EquationFactory.createEquation(coefficients));
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }

        return equations;
    }
}