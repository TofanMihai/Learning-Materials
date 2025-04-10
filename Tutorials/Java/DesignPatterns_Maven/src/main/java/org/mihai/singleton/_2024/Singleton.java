package org.mihai.singleton._2024;

import java.util.Objects;

public class Singleton {
    private static volatile Singleton instance;
    private final String data1;
    private String data2;

    private Singleton(String data1, String data2) {
        this.data1 = data1;
        this.data2 = data2;
    }

    public static Singleton getInstance(String data1, String data2) {

        if (Objects.isNull(instance)) {
            synchronized (Singleton.class) {
                if (Objects.isNull(instance)) {
                    instance = new Singleton(data1, data2);
                }
            }
        }
        return instance;
    }
}
