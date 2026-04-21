public class SaveCommand implements Command {
    private final TextEditor textEditor;

    public SaveCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        textEditor.saveDocument();
    }
}