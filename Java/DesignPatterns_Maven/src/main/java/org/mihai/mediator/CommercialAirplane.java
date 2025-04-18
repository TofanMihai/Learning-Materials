package mediator;

public class CommercialAirplane implements Airplane {
    private final AirTrafficController airTrafficController;
    public final Long id;

    public CommercialAirplane(AirTrafficController airTrafficController, Long ID) {
        this.airTrafficController = airTrafficController;
        this.id = ID;
    }

    @Override
    public void requestTakeOff() {
        airTrafficController.requestTakeOff(this);
    }

    @Override
    public void requestLanding() {
        airTrafficController.requestLanding(this);
    }

    @Override
    public void notifyAirTrafficControl(String message) {
        System.out.println("Airplane " + this.id + " " + message);
    }
}
