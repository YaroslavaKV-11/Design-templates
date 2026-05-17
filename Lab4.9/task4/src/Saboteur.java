public class Saboteur extends Spy {

    public void visit(GeneralStaff generalStaff) {
        generalStaff.setGenerals(0);
        generalStaff.setSecretPaper(0);

        System.out.println("Saboteur visited general staff");
    }

    public void visit(MilitaryBase militaryBase) {
        militaryBase.setOfficers(0);
        militaryBase.setSoldiers(0);
        militaryBase.setJeeps(0);
        militaryBase.setTanks(0);

        System.out.println("Saboteur visited military base");
    }
}