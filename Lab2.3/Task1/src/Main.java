public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        Car sedan = director.buildSedan();
        Car hatchback = director.buildHatchback();
        Car suv = director.buildSUV();
        Car electricSuv = director.buildElectricSUV();

        System.out.println(sedan);
        System.out.println(hatchback);
        System.out.println(suv);
        System.out.println(electricSuv);
    }
}