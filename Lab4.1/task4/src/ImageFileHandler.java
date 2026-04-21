public class ImageFileHandler extends FileHandler {
    @Override
    public void open(String fileName) {
        String extension = getExtension(fileName);
        if (extension.equals("jpg") || extension.equals("png")) {
            System.out.println("Open image file " + fileName + " with image viewer.");
        } else {
            super.open(fileName);
        }
    }
}