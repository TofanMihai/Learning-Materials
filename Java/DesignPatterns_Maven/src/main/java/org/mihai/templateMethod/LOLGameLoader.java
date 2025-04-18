package org.mihai.templateMethod;

public class LOLGameLoader extends BaseGameLoader {
    @Override
    void loadLocalData() {
        System.out.println("Loading Data for LOL");
    }

    @Override
    void cleanTempFiles() {
        System.out.println("Cleaning Temp Files for LOL");
    }
}
