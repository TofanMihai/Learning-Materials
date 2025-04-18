package org.mihai.templateMethod;

public class DriverClass {

    public static void main(String[] args) {
        LOLGameLoader lolGameLoader = new LOLGameLoader();
        ACGameLoader acGameLoader = new ACGameLoader();

        lolGameLoader.load();
        System.out.println("-------");
        acGameLoader.load();
    }
}
