package org.mihai.templateMethod;

public abstract class BaseGameLoader {

    /**
     * Template method containing all the steps/method calls of our repeated functionality
     */
    public void load() {
        loadLocalData();
        cleanTempFiles();
        initializeProfiles();
    }

    /**
     * Abstract methods to be implemented by the subclasses
     */
    abstract void loadLocalData();

    abstract void cleanTempFiles();

    /**
     * Default behaviour for all implementations of our algorithm
     */
    protected void initializeProfiles() {
        System.out.println("Initializing profiles");
    }

}
