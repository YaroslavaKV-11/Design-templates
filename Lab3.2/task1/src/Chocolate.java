public class Chocolate extends Beverage {
    private final boolean withMilk;
    private final int volume;

    public Chocolate(int sugar, Serving serving, boolean withMilk, int volume) {
        super(sugar, serving);
        this.withMilk = withMilk;
        this.volume = volume;
    }

    @Override
    public void prepare() {
        System.out.println("Put some cacao...");
        System.out.printf("Prepare volume: %s ml...%n", volume);

        if (withMilk) {
            System.out.println("Put some milk...");
        }

        if (sugar > 0) {
            System.out.printf("Put some sugar: %s pieces...%n", sugar);
        }
    }

    @Override
    public void drink() {
        serving.serve(getName());
        if (withMilk) {
            System.out.println("Drink milk chocolate!");
        } else {
            System.out.println("Drink black chocolate!");
        }
    }

    @Override
    public int cost() {
        int result = 15;

        if (withMilk) {
            result += 3;
        }

        result += serving.getPackageCost();
        return result;
    }

    @Override
    public String getName() {
        if (withMilk) {
            return "milk chocolate";
        }
        return "black chocolate";
    }
}