public class UserSize implements ButtonSize {
    private final int width;
    private final int height;

    public UserSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void applySize() {
        System.out.println("Setting custom size: " + width + "x" + height + "...");
    }
}