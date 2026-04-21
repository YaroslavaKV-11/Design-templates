public class Tea extends Beverage {
    private final boolean withMilk;
    private final int waterVolume;
    private final int milkVolume;

    public Tea(int sugar, Serving serving, boolean withMilk, int waterVolume, int milkVolume) {
        super(sugar, serving);
        this.withMilk = withMilk;
        this.waterVolume = waterVolume;
        this.milkVolume = milkVolume;
    }

    @Override
    public void prepare() {
        System.out.println("Put some tea...");
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
            System.out.println("Drink tea with milk!");
        } else {
            System.out.println("Drink black tea!");
        }
    }

    @Override
    public int cost() {
        int result = 7;

        if (withMilk) {
            result += (int) (milkVolume / 20.0);
        }

        result += serving.getPackageCost();
        return result;
    }

    @Override
    public String getName() {
        if (withMilk) {
            return "tea with milk";
        }
        return "black tea";
    }
}