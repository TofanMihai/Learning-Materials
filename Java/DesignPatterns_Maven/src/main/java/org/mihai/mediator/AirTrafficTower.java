package mediator;

/**
 * Concrete mediator
 */
public class AirTrafficTower implements AirTrafficController {
    @Override
    public void requestTakeOff(Airplane airplane) {
        // Logic for coordinating takeoff
        airplane.notifyAirTrafficControl("Requesting takeoff clearance.");
    }

    @Override
    public void requestLanding(Airplane airplane) {
        // Logic for coordinating landing
        airplane.notifyAirTrafficControl("Requesting landing clearance.");
    }
}
