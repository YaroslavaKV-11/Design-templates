import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        final List<MilitaryObject> militaryObjects = new ArrayList<>();

        militaryObjects.add(new GeneralStaff(20, 100));
        militaryObjects.add(new MilitaryBase(10, 1000, 300, 20));

        System.out.println("Before spies:");

        for (MilitaryObject military : militaryObjects) {
            System.out.println(military);
        }

        Spy secretAgent = new SecretAgent();

        for (MilitaryObject military : militaryObjects) {
            military.accept(secretAgent);
        }

        System.out.println("After secret agent:");

        for (MilitaryObject military : militaryObjects) {
            System.out.println(military);
        }

        Spy saboteur = new Saboteur();

        for (MilitaryObject military : militaryObjects) {
            military.accept(saboteur);
        }

        System.out.println("After saboteur:");

        for (MilitaryObject military : militaryObjects) {
            System.out.println(military);
        }
    }
}