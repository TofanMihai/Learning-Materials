package org.mihai.adapter._2022;

public class Adapter implements ITarget {
    public AdapteeAttacker adapteeAtacker = new AdapteeAttacker();

    public Adapter(AdapteeAttacker adapteeAtacker) {
        this.adapteeAtacker = adapteeAtacker;
    }

    @Override
    public void fireWeapon() {
        adapteeAtacker.smash();
    }

    @Override
    public void drive() {
        adapteeAtacker.walk();
    }

}
