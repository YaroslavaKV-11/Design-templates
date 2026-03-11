public class Main {
    public static void main(String[] args) {
        Director director1 = Director.getInstance();
        Director director2 = Director.getInstance();

        Car sedan = director1.buildSedan();
        Car hatchback = director1.buildHatchback();
        Car suv = director1.buildSUV();
        Car electricSuv = director1.buildElectricSUV();

        System.out.println(sedan);
        System.out.println(hatchback);
        System.out.println(suv);
        System.out.println(electricSuv);

        System.out.println("Check singleton:");
        System.out.println("director1 == director2 -> " + (director1 == director2));
    }
}