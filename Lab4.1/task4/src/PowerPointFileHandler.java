public class PowerPointFileHandler extends FileHandler {
    @Override
    public void open(String fileName) {
        String extension = getExtension(fileName);
        if (extension.equals("ppt") || extension.equals("pptx")) {
            System.out.println("Open presentation file " + fileName + " with presentation program.");
        } else {
            super.open(fileName);
        }
    }
}