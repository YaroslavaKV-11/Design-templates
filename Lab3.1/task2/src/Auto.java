public class Auto {
    private final int age;
    private final String model;
    private final boolean damaged;
    private final int mileage;

    public Auto(int age, String model, boolean damaged, int mileage) {
        this.age = age;
        this.model = model;
        this.damaged = damaged;
        this.mileage = mileage;
    }

    public int getAge() {
        return age;
    }

    public String getModel() {
        return model;
    }

    public boolean isDamaged() {
        return damaged;
    }

    public int getMileage() {
        return mileage;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "age=" + age +
                ", model='" + model + '\'' +
                ", damaged=" + damaged +
                ", mileage=" + mileage +
                '}';
    }
}