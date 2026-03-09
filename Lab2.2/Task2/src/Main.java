public class Main {
    public static void main(String[] args) {
        int days = 200;

        int espressoPerDay = 10;
        int americanoPerDay = 8;
        int cappuccinoPerDay = 6;
        int lattePerDay = 5;

        CoffeeMachineFactory[] factories = {
                new PhilipsFactory(),
                new BoschFactory(),
                new DeLonghiFactory()
        };

        CoffeeMachineFactory bestFactory = null;
        double bestProfit = Double.NEGATIVE_INFINITY;

        for (CoffeeMachineFactory factory : factories) {
            CoffeeShopAnalyzer.printAnalysis(
                    factory,
                    days,
                    espressoPerDay,
                    americanoPerDay,
                    cappuccinoPerDay,
                    lattePerDay
            );

            double totalProfit = CoffeeShopAnalyzer.calculateTotalProfit(
                    factory,
                    days,
                    espressoPerDay,
                    americanoPerDay,
                    cappuccinoPerDay,
                    lattePerDay
            );

            if (totalProfit > bestProfit) {
                bestProfit = totalProfit;
                bestFactory = factory;
            }
        }

        if (bestFactory != null) {
            System.out.println("Best choice: " + bestFactory.getManufacturerName());
            System.out.println("Maximum profit after " + days + " days: " + bestProfit);
        }
    }
}