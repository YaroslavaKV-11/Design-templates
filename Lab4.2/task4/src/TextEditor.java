public class TextEditor {
    private Document document;
    final private Button saveButton;
    final private Button printButton;
    final private MenuItem saveMenuItem;
    final private MenuItem printMenuItem;
    final private MenuItem showInfoMenuItem;
    final private Shortcut saveShortcut;
    final private Shortcut printShortcut;

    public TextEditor() {
        saveButton = new Button();
        printButton = new Button();
        saveMenuItem = new MenuItem();
        printMenuItem = new MenuItem();
        showInfoMenuItem = new MenuItem();
        saveShortcut = new Shortcut();
        printShortcut = new Shortcut();

        Command saveCommand = new SaveCommand(this);
        Command printCommand = new PrintCommand(this);
        Command showInfoCommand = new ShowInfoCommand(this);

        saveButton.setCommand(saveCommand);
        printButton.setCommand(printCommand);
        saveMenuItem.setCommand(saveCommand);
        printMenuItem.setCommand(printCommand);
        showInfoMenuItem.setCommand(showInfoCommand);
        saveShortcut.setCommand(saveCommand);
        printShortcut.setCommand(printCommand);
    }

    public void newDocument(String name) {
        document = new Document(name);
    }

    public void clickSaveButton() {
        saveButton.click();
    }

    public void clickPrintButton() {
        printButton.click();
    }

    public void selectSaveMenuItem() {
        saveMenuItem.select();
    }

    public void selectPrintMenuItem() {
        printMenuItem.select();
    }

    public void selectShowInfoMenuItem() {
        showInfoMenuItem.select();
    }

    public void pressSaveShortcut() {
        saveShortcut.press();
    }

    public void pressPrintShortcut() {
        printShortcut.press();
    }

    public void saveDocument() {
        if (document != null) {
            document.save();
        }
    }

    public void printDocument() {
        if (document != null) {
            document.print();
        }
    }

    public void showDocumentInfo() {
        if (document != null) {
            document.showInfo();
        }
    }
}