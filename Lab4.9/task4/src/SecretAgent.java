public class SecretAgent extends Spy {

    public void visit(GeneralStaff generalStaff) {
        int secretPapers = generalStaff.getSecretPaper() / 2;

        generalStaff.setSecretPaper(generalStaff.getSecretPaper() - secretPapers);

        System.out.println("SecretAgent took " + secretPapers + " secret papers from general staff");
    }

    public void visit(MilitaryBase militaryBase) {
        System.out.println("SecretAgent collected information about military base");
    }
}