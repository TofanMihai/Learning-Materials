package org.mihai.zz_justTesting.idk;

public interface MyInterface {

    default void do1(String string) {
        System.out.println("Print from interface");
    }

    void do2(String string);

    int interfaceInt = 2;
}
