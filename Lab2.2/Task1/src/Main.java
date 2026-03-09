public class Main {
    public static void main(String[] args) {
        int busCount = 3;          
        int tramCount = 2;         
        int trolleybusCount = 4;   
        int thousandsOfKm = 100;   

        TransportFactory[] factories = {
                new VolvoFactory(),
                new SkodaFactory(),
                new HyundaiFactory()
        };

        TransportFactory bestFactory = null;
        double minTotalCost = Double.MAX_VALUE;

        for (TransportFactory factory : factories) {
            TransportParkAnalyzer.printAnalysis(
                    factory,
                    busCount,
                    tramCount,
                    trolleybusCount,
                    thousandsOfKm
            );

            double totalCost = TransportParkAnalyzer.calculateTotalCost(
                    factory,
                    busCount,
                    tramCount,
                    trolleybusCount,
                    thousandsOfKm
            );

            if (totalCost < minTotalCost) {
                minTotalCost = totalCost;
                bestFactory = factory;
            }
        }

        if (bestFactory != null) {
            System.out.println("Best choice: " + bestFactory.getManufacturerName());
            System.out.println("Minimum total cost: " + minTotalCost);
        }
    }
}