public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        Car originalCar = director.buildSedan();
        Car copiedCar = originalCar.copy();

        System.out.println("Original car:");
        System.out.println(originalCar);

        System.out.println("Copied car:");
        System.out.println(copiedCar);

        System.out.println("Check references:");
        System.out.println("originalCar == copiedCar -> " + (originalCar == copiedCar));
        System.out.println("originalCar.getEngine() == copiedCar.getEngine() -> "
                + (originalCar.getEngine() == copiedCar.getEngine()));
        System.out.println("originalCar.getWheel() == copiedCar.getWheel() -> "
                + (originalCar.getWheel() == copiedCar.getWheel()));
        System.out.println("originalCar.getTransmission() == copiedCar.getTransmission() -> "
                + (originalCar.getTransmission() == copiedCar.getTransmission()));
        System.out.println("originalCar.getTire() == copiedCar.getTire() -> "
                + (originalCar.getTire() == copiedCar.getTire()));
    }
}