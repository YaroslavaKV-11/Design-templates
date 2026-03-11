public class Main {
    public static void main(String[] args) {
        TextEditor editor1 = TextEditor.getInstance();
        TextEditor editor2 = TextEditor.getInstance();

        String fileName = "input.txt";
        String text = editor1.readFromFile(fileName);

        System.out.println("Text from file:");
        System.out.println(text);
        System.out.println();

        System.out.println("Number of lines: " + editor1.countLines(text));
        System.out.println("Number of words: " + editor1.countWords(text));
        System.out.println();

        System.out.println("Text in upper case:");
        System.out.println(editor1.toUpperCase(text));
        System.out.println();

        System.out.println("Check singleton:");
        System.out.println("editor1 == editor2 -> " + (editor1 == editor2));
    }
}