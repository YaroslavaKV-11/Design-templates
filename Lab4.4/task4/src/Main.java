public class Main {
    public static void main(String[] args) {
        Runway runway = new Runway();
        PlanesInFlight planesInFlight = new PlanesInFlight();
        PlanesOnGround planesOnGround = new PlanesOnGround();
        FlightMediator mediator = new ControlTower(runway, planesInFlight, planesOnGround);

        Plane plane = new Plane(123, mediator);
        plane.takeOff();
        plane.land();
    }
}