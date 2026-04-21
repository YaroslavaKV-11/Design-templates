public class TypeHandler extends ImageHandler {
    @Override
    public void handle(Image image) {
        image.setType(Image.Type.jpg);
        super.handle(image);
    }
}