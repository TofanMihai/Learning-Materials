package org.mihai.proxy._2022;

public class DriverClass {
    public static void main(String[] args) {
        ImageInterface image = new ProxyImage("test_10mb.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println("");

        //image will not be loaded from disk
        image.display();
    }
}
