import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextEditor {
    private static TextEditor instance;

    private TextEditor() {
    }

    public static TextEditor getInstance() {
        if (instance == null) {
            instance = new TextEditor();
        }
        return instance;
    }

    public String readFromFile(String fileName) {
        StringBuilder text = new StringBuilder();

        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                text.append(scanner.nextLine());
                if (scanner.hasNextLine()) {
                    text.append("\n");
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }

        return text.toString();
    }

    public int countLines(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }

        String[] lines = text.split("\n");
        return lines.length;
    }

    public int countWords(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }

        String[] words = text.trim().split("\\s+");
        return words.length;
    }

    public String toUpperCase(String text) {
        return text.toUpperCase();
    }
}