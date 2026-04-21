public class NameHandler extends ImageHandler {
    @Override
    public void handle(Image image) {
        String creationDate = image.getCreationDate();
        String creationTime = image.getCreationTime();
        String type = image.getType().toString();
        String name = "IMG_" + creationDate + "_" + creationTime + "." + type;
        image.setName(name);
        super.handle(image);
    }
}