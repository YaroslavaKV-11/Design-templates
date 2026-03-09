public class Wheel {
    private int diameter;

    public Wheel(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    @Override
    public String toString() {
        return "Wheel{diameter=" + diameter + "}";
    }
}