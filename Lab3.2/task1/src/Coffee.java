public class Coffee extends Beverage {
    private final boolean withMilk;
    private final boolean extraCoffee;
    private final int waterVolume;
    private final int milkVolume;

    public Coffee(int sugar, Serving serving, boolean withMilk, boolean extraCoffee, int waterVolume, int milkVolume) {
        super(sugar, serving);
        this.withMilk = withMilk;
        this.extraCoffee = extraCoffee;
        this.waterVolume = waterVolume;
        this.milkVolume = milkVolume;
    }

    @Override
    public void prepare() {
        System.out.println("Put some coffee...");
        if (extraCoffee) {
            System.out.println("Put extra coffee...");
        }
        System.out.printf("Put some hot water: %s ml...%n", waterVolume);

        if (withMilk) {
            System.out.printf("Put some milk: %s ml...%n", milkVolume);
        }

        if (sugar > 0) {
            System.out.printf("Put some sugar: %s pieces...%n", sugar);
        }
    }

    @Override
    public void drink() {
        serving.serve(getName());
        if (withMilk) {
            System.out.println("Drink coffee with milk!");
        } else {
            System.out.println("Drink black coffee!");
        }
    }

    @Override
    public int cost() {
        int result = 10;

        if (withMilk) {
            result += (int) (milkVolume / 20.0);
        }

        result += serving.getPackageCost();
        return result;
    }

    @Override
    public String getName() {
        if (withMilk) {
            return "coffee with milk";
        }
        return "black coffee";
    }
}