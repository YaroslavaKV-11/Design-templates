public class InRestaurant implements Serving {
    @Override
    public void serve(String beverageName) {
        System.out.println("Serve " + beverageName + " in a cup for drinking in cafe.");
    }

    @Override
    public int getPackageCost() {
        return 0;
    }
}