public class WordFileHandler extends FileHandler {
    @Override
    public void open(String fileName) {
        String extension = getExtension(fileName);
        if (extension.equals("doc") || extension.equals("docx")) {
            System.out.println("Open document file " + fileName + " with word processor.");
        } else {
            super.open(fileName);
        }
    }
}