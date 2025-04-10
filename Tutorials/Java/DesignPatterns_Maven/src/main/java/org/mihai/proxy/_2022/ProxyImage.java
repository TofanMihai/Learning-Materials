package org.mihai.proxy._2022;


/**
 * This example displays the use of the ProxyDP for lazy initialization
 */
public class ProxyImage implements ImageInterface {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
	   