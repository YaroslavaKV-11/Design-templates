public class Cafe {
    public static void main(String[] args) {
        Serving inRestaurant = new InRestaurant();
        Serving takeAway = new TakeAway();

        Beverage blackCoffeeInCafe = new Coffee(3, inRestaurant, false, true, 200, 0);
        Beverage coffeeWithMilkTakeAway = new Coffee(2, takeAway, true, false, 150, 50);

        Beverage blackTeaInCafe = new Tea(0, inRestaurant, false, 300, 0);
        Beverage teaWithMilkTakeAway = new Tea(2, takeAway, true, 250, 50);

        Beverage blackChocolateInCafe = new Chocolate(1, inRestaurant, false, 200);
        Beverage milkChocolateTakeAway = new Chocolate(2, takeAway, true, 250);

        beverageInfo(blackCoffeeInCafe);
        beverageInfo(coffeeWithMilkTakeAway);
        beverageInfo(blackTeaInCafe);
        beverageInfo(teaWithMilkTakeAway);
        beverageInfo(blackChocolateInCafe);
        beverageInfo(milkChocolateTakeAway);
    }

    private static void beverageInfo(Beverage beverage) {
        System.out.println("=========================");
        beverage.prepare();
        System.out.printf("Cost of beverage: %s grn%n", beverage.cost());
        beverage.drink();
    }
}