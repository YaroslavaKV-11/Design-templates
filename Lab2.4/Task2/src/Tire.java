public class Tire implements Prototype<Tire> {
    public enum Season {
        Summer,
        Winter,
        AllSeason
    }

    final private Season season;
    final private String brand;

    public Tire(Season season, String brand) {
        this.season = season;
        this.brand = brand;
    }

    @Override
    public Tire copy() {
        return new Tire(season, brand);
    }

    @Override
    public String toString() {
        return "Tire{" +
                "season=" + season +
                ", brand='" + brand + '\'' +
                '}';
    }
}