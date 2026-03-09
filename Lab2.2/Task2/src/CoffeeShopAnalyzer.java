public class CoffeeShopAnalyzer {

    public static double calculateDailyProfit(CoffeeMachineFactory factory,
                                              int espressoCount,
                                              int americanoCount,
                                              int cappuccinoCount,
                                              int latteCount) {
        double dailyProfit = 0.0;

        dailyProfit += factory.createEspresso().getProfit() * espressoCount;
        dailyProfit += factory.createAmericano().getProfit() * americanoCount;
        dailyProfit += factory.createCappuccino().getProfit() * cappuccinoCount;
        dailyProfit += factory.createLatte().getProfit() * latteCount;

        return dailyProfit;
    }

    public static double calculateTotalProfit(CoffeeMachineFactory factory,
                                              int days,
                                              int espressoCount,
                                              int americanoCount,
                                              int cappuccinoCount,
                                              int latteCount) {
        double dailyProfit = calculateDailyProfit(
                factory,
                espressoCount,
                americanoCount,
                cappuccinoCount,
                latteCount
        );

        return dailyProfit * days
                - factory.getMachinePrice()
                - factory.getDailyServiceCost() * days;
    }

    public static void printAnalysis(CoffeeMachineFactory factory,
                                     int days,
                                     int espressoCount,
                                     int americanoCount,
                                     int cappuccinoCount,
                                     int latteCount) {
        double dailyProfit = calculateDailyProfit(
                factory,
                espressoCount,
                americanoCount,
                cappuccinoCount,
                latteCount
        );

        double totalProfit = calculateTotalProfit(
                factory,
                days,
                espressoCount,
                americanoCount,
                cappuccinoCount,
                latteCount
        );

        System.out.println("Manufacturer: " + factory.getManufacturerName());
        System.out.println("Machine price: " + factory.getMachinePrice());
        System.out.println("Daily service cost: " + factory.getDailyServiceCost());
        System.out.println("Sold per day:");
        System.out.println("  Espresso: " + espressoCount);
        System.out.println("  Americano: " + americanoCount);
        System.out.println("  Cappuccino: " + cappuccinoCount);
        System.out.println("  Latte: " + latteCount);
        System.out.println("Daily drinks profit: " + dailyProfit);
        System.out.println("Profit after " + days + " days: " + totalProfit);

        if (totalProfit >= 0) {
            System.out.println("This manufacturer allows Ivan to make profit in " + days + " days.");
        } else {
            System.out.println("This manufacturer does NOT allow Ivan to make profit in " + days + " days.");
        }

        System.out.println();
    }
}