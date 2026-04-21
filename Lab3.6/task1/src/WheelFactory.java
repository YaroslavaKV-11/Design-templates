import java.util.HashMap;
import java.util.Map;

public class WheelFactory {
    private static final Map<Integer, Wheel> wheels = new HashMap<>();

    public static Wheel getWheel(int diameter) {
        if (!wheels.containsKey(diameter)) {
            wheels.put(diameter, new Wheel(diameter));
        }

        return wheels.get(diameter);
    }
}