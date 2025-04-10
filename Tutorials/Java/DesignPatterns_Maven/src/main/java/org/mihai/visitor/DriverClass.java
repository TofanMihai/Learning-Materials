package org.mihai.visitor;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DriverClass {

    public static void main(String[] args) {

        ChildA childA1 = new ChildA();
        ChildA childA2 = new ChildA();
        ChildB childB1 = new ChildB();
        ChildB childB2 = new ChildB();

        List<ParentComponent> elements = new ArrayList<>(
                Arrays.asList(
                        childA1,
                        childB1,
                        childA2,
                        childB2));

        DoSomethingVisitor doSomethingVisitor = new DoSomethingVisitor();
        DoSomethingElseVisitor doSomethingElseVisitor = new DoSomethingElseVisitor();

        for (ParentComponent p :
                elements) {
            p.accept(doSomethingVisitor);
            p.accept(doSomethingElseVisitor);
            System.out.println("\n");
        }


    }
}
