package chainOfResponsibility._2022;

public class DriverClass {
    public static void main(String[] args) {

        // Here I define all of the objects in the chain

        Chain chainCalc1 = new AddNumbers();
        Chain chainCalc2 = new SubtractNumbers();
        Chain chainCalc3 = new MultNumbers();


        // Here I tell each object where to forward the
        // data if it can't process the request

        chainCalc1.setNextChain(chainCalc2);
        chainCalc2.setNextChain(chainCalc3);

        // Define the data in the Numbers Object
        // and send it to the first Object in the chain

        Numbers request = new Numbers(4, 2, "ms");

        chainCalc1.solveRequest(request);

    }
}
