public class LowState implements State {

    public void turnUp(Fan fan) {
        fan.setState(new MediumState());

        System.out.println("Fan is on medium");
    }

    public void turnDown(Fan fan) {
    }
}