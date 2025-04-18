package org.mihai.prototype._2022;

public class DriverClass {
    public static void main(String[] args) {
        CloneFactory animalFactory = new CloneFactory();

        Sheep sheep = new Sheep();

        Animal clonedSheep = animalFactory.getClone(sheep);

        System.out.println(sheep);
//		System.out.println(clonedSheep);
    }
}
