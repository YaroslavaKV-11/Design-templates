public class ImageProxy implements DisplayObject {
    private final String path;
    private ImageFile imageFile;

    public ImageProxy(String path) {
        this.path = path;
    }

    @Override
    public void display() {
        if (imageFile == null) {
            imageFile = new ImageFile(path);
        }
        imageFile.display();
    }
}