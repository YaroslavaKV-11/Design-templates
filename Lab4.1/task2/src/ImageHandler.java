public abstract class ImageHandler {
    protected ImageHandler next;

    public ImageHandler setNext(ImageHandler next) {
        this.next = next;
        return next;
    }

    public void handle(Image image) {
        if (next != null) {
            next.handle(image);
        }
    }
}