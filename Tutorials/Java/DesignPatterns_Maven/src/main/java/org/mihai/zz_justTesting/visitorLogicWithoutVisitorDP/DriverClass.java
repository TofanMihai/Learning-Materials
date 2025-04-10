package org.mihai.zz_justTesting.visitorLogicWithoutVisitorDP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DriverClass {

    public static void main(String[] args) {
        Parent childA = new ChildA();
        Parent childB = new ChildB();
        List<Parent> myList = new ArrayList<>(Arrays.asList(childA, childB));

        for (Parent p :
                myList) {
            p.doSomething();
        }
    }
}
