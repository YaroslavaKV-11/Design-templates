public class PdfFileHandler extends FileHandler {
    @Override
    public void open(String fileName) {
        String extension = getExtension(fileName);
        if (extension.equals("pdf")) {
            System.out.println("Open pdf file " + fileName + " with pdf reader.");
        } else {
            super.open(fileName);
        }
    }
}