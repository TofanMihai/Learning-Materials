package org.mihai.adapter._2022;

public class DriverClass {
    public static void main(String[] args) {


        AdapteeAttacker adapteeAttacker = new AdapteeAttacker();
        ITarget adapter = new Adapter(adapteeAttacker);

        adapter.fireWeapon();
        adapter.drive();

    }
}
