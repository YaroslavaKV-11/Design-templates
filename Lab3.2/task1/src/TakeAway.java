public class TakeAway implements Serving {
    @Override
    public void serve(String beverageName) {
        System.out.println("Serve " + beverageName + " in a paper cup for takeaway.");
    }

    @Override
    public int getPackageCost() {
        return 5;
    }
}