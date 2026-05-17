public abstract class AbstractClass {

    public final void templateMethod() {
        stepOne();
        stepTwo();
        stepThree();
    }

    private void stepOne() {
        System.out.println("Step one");
    }

    protected abstract void stepTwo();

    protected abstract void stepThree();
}