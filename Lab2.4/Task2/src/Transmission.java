public class Transmission implements Prototype<Transmission> {
    public enum Type {
        Manual,
        Automatic
    }

    final private Type type;
    final private int gears;

    public Transmission(Type type, int gears) {
        this.type = type;
        this.gears = gears;
    }

    @Override
    public Transmission copy() {
        return new Transmission(type, gears);
    }

    @Override
    public String toString() {
        return "Transmission{" +
                "type=" + type +
                ", gears=" + gears +
                '}';
    }
}