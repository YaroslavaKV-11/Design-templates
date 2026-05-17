public abstract class Defender {

    public final void defendAgainstAttack() {
        pickUpWeapon();
        defenseAction();
        moveToSafety();

        System.out.println();
    }

    public abstract void pickUpWeapon();

    public abstract void defenseAction();

    public abstract void moveToSafety();
}