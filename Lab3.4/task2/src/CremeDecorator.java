public class CremeDecorator extends BeverageDecorator {
    public CremeDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String description() {
        return beverage.description() + ", creme";
    }

    @Override
    public float cost() {
        return beverage.cost() + 0.25f;
    }
}