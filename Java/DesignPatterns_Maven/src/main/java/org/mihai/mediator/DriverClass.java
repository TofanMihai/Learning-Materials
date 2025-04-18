package mediator;

public class DriverClass {

    public static void main(String[] args) {
        AirTrafficController airTrafficController = new AirTrafficTower();

        Airplane plane1 = new CommercialAirplane(airTrafficController, 1L);
        Airplane plane2 = new CommercialAirplane(airTrafficController, 2L);

        plane1.requestLanding();
        plane2.requestTakeOff();

    }
}
