public abstract class Pizza {

    public void makeBase() {
        System.out.println("Mix flour, yeast and salt");
        System.out.println("Roll out the dough");
    }


    public abstract void addToppings();

    public abstract void cook();

    public final void printInstructions() {
        makeBase();
        addToppings();
        cook();
        System.out.println();
    }
}