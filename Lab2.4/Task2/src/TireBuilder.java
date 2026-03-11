public class TireBuilder {
    private Tire.Season season;
    private String brand;

    public TireBuilder setSeason(Tire.Season season) {
        this.season = season;
        return this;
    }

    public TireBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public Tire build() {
        return new Tire(season, brand);
    }
}