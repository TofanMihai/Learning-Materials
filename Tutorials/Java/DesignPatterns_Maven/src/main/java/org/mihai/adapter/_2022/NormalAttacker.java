package org.mihai.adapter._2022;

// Totally Unrelated tbh
public class NormalAttacker implements ITarget {

    @Override
    public void fireWeapon() {
        System.out.println("Normal attacker fired his weapon");
    }

    @Override
    public void drive() {
        System.out.println("Normal attacker is driving");
    }
}
