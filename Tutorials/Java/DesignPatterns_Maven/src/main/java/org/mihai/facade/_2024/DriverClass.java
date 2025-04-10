package org.mihai.facade._2024;

public class DriverClass {

    public static void main(String[] args) {
        SubsystemFacade subsystemFacade = new SubsystemFacade(new SubsystemA(), new SubsystemB());

        subsystemFacade.operationA();
        subsystemFacade.operationB();
        subsystemFacade.executeOperations();
    }
}
