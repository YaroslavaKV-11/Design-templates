import java.util.Random;

public class Client {
    static Random random = new Random();

    public static void main(String[] args) {
        ImageHandler cameraHandler = new CameraHandler();
        ImageHandler creationTimeHandler = new CreationTimeHandler();
        ImageHandler creationDateHandler = new CreationDateHandler();
        ImageHandler typeHandler = new TypeHandler();
        ImageHandler nameHandler = new NameHandler();

        cameraHandler
                .setNext(creationTimeHandler)
                .setNext(creationDateHandler)
                .setNext(typeHandler)
                .setNext(nameHandler);

        for (int i = 0; i <= 10; ++i) {
            Image image = new Image();
            cameraHandler.handle(image);

            try {
                Thread.sleep(1000 + random.nextInt(1500));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Image created + " + image);
        }
    }
}