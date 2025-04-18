package org.mihai.templateMethod;

public class ACGameLoader extends BaseGameLoader {
    @Override
    void loadLocalData() {
        System.out.println("Loading data for AC4");
    }

    @Override
    void cleanTempFiles() {
        System.out.println("Cleaning Temp Data for AC4");
    }
}
