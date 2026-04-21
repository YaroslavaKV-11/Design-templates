import java.text.SimpleDateFormat;
import java.util.Date;

public class CreationTimeHandler extends ImageHandler {
    @Override
    public void handle(Image image) {
        String time = new SimpleDateFormat("HHmmss").format(new Date());
        image.setCreationTime(time);
        super.handle(image);
    }
}