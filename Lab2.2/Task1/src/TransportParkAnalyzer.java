public class TransportParkAnalyzer {

    public static double calculatePurchaseCost(TransportFactory factory,
                                               int busCount,
                                               int tramCount,
                                               int trolleybusCount) {
        return factory.createBus().getPurchasePrice() * busCount
                + factory.createTram().getPurchasePrice() * tramCount
                + factory.createTrolleybus().getPurchasePrice() * trolleybusCount;
    }

    public static double calculateOperatingCost(TransportFactory factory,
                                                int busCount,
                                                int tramCount,
                                                int trolleybusCount,
                                                int thousandsOfKm) {
        int totalKm = thousandsOfKm * 1000;

        return factory.createBus().getOperatingCostPerKm() * totalKm * busCount
                + factory.createTram().getOperatingCostPerKm() * totalKm * tramCount
                + factory.createTrolleybus().getOperatingCostPerKm() * totalKm * trolleybusCount;
    }

    public static double calculateTotalCost(TransportFactory factory,
                                            int busCount,
                                            int tramCount,
                                            int trolleybusCount,
                                            int thousandsOfKm) {
        double purchaseCost = calculatePurchaseCost(factory, busCount, tramCount, trolleybusCount);
        double operatingCost = calculateOperatingCost(factory, busCount, tramCount, trolleybusCount, thousandsOfKm);

        return purchaseCost + operatingCost;
    }

    public static void printAnalysis(TransportFactory factory,
                                     int busCount,
                                     int tramCount,
                                     int trolleybusCount,
                                     int thousandsOfKm) {
        double purchaseCost = calculatePurchaseCost(factory, busCount, tramCount, trolleybusCount);
        double operatingCost = calculateOperatingCost(factory, busCount, tramCount, trolleybusCount, thousandsOfKm);
        double totalCost = calculateTotalCost(factory, busCount, tramCount, trolleybusCount, thousandsOfKm);

        System.out.println("Manufacturer: " + factory.getManufacturerName());
        System.out.println("Buses: " + busCount);
        System.out.println("Trams: " + tramCount);
        System.out.println("Trolleybuses: " + trolleybusCount);
        System.out.println("Distance: " + thousandsOfKm + " thousand km");
        System.out.println("Purchase cost: " + purchaseCost);
        System.out.println("Operating cost: " + operatingCost);
        System.out.println("Total cost: " + totalCost);
        System.out.println();
    }
}