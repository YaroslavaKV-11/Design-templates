import java.text.SimpleDateFormat;
import java.util.Date;

public class CreationDateHandler extends ImageHandler {
    @Override
    public void handle(Image image) {
        String date = new SimpleDateFormat("yyyyMMdd").format(new Date());
        image.setCreationDate(date);
        super.handle(image);
    }
}