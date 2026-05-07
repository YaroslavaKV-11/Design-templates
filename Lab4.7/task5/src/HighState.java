public class HighState implements State {

    public void turnUp(Fan fan) {
    }

    public void turnDown(Fan fan) {
        fan.setState(new MediumState());

        System.out.println("Fan is on medium");
    }
}