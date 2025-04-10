package org.mihai.singleton._2024;

public class DriverClass {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("Mihai", "Ana");
        Singleton singleton1 = Singleton.getInstance("Mihai", "Leoaica");
        System.out.println(singleton);

    }
}
