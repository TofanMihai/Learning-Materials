package org.mihai.facade._2024;

public class SubsystemFacade {
    private final SubsystemA subsystemA;
    private final SubsystemB subsystemB;

    public SubsystemFacade(SubsystemA subsystemA, SubsystemB subsystemB) {
        this.subsystemA = subsystemA;
        this.subsystemB = subsystemB;
    }

    public void operationA() {
        this.subsystemA.operationA();
    }

    public void operationB() {
        this.subsystemB.operationB();
    }

    public void executeOperations() {
        this.subsystemA.operationA();
        this.subsystemB.operationB();
    }
}
