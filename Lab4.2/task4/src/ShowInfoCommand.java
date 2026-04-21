public class ShowInfoCommand implements Command {
    private final TextEditor textEditor;

    public ShowInfoCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        textEditor.showDocumentInfo();
    }
}