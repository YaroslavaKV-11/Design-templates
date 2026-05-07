public class MediumState implements State {

    public void turnUp(Fan fan) {
        fan.setState(new HighState());

        System.out.println("Fan is on high");
    }

    public void turnDown(Fan fan) {
        fan.setState(new LowState());

        System.out.println("Fan is on low");
    }
}