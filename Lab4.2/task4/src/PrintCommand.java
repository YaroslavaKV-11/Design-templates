public class PrintCommand implements Command {
    private final TextEditor textEditor;

    public PrintCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        textEditor.printDocument();
    }
}