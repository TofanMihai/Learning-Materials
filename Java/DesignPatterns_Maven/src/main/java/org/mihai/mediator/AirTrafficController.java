package mediator;

/**
 * Mediator Interface
 */
public interface AirTrafficController {
    void requestTakeOff(Airplane airplane);

    void requestLanding(Airplane airplane);
}
