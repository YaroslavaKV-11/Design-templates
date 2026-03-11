public class Wheel implements Prototype<Wheel> {
    public enum Material {
        Steel,
        Alloy,
        Forged
    }

    final private Material material;
    final int diameter;

    public Wheel(Material material, int diameter) {
        this.material = material;
        this.diameter = diameter;
    }

    @Override
    public Wheel copy() {
        return new Wheel(material, diameter);
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "material=" + material +
                ", diameter=" + diameter +
                '}';
    }
}