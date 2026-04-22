public interface FlightMediator {
    void registerPlane(Plane plane);
    void takeOff(Plane plane);
    void land(Plane plane);
}