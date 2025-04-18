package org.mihai.state;

public class DriverClass {

    public static void main(String[] args) {

        Package pkg = new Package();

        pkg.printStatus();

        pkg.nextState();
        pkg.printStatus();

        pkg.nextState();
        pkg.printStatus();

        pkg.previousState();
        pkg.printStatus();


//        State -> the client/an action decides when to go to another state.
        // Chain of responsibily -> If an action cannot be completed, it will go down in the chain. The fnctionality decides when to go to the next chain

        // State is used for representing FSMs.

    }
}