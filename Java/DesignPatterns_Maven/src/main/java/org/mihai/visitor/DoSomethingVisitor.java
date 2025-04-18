package org.mihai.visitor;

public class DoSomethingVisitor implements Visitor {
    @Override
    public void visit(ChildA childA) {
        System.out.println("DoSomething on ChildA");
    }

    @Override
    public void visit(ChildB childB) {
        System.out.println("DoSomething on ChildB");

    }
}
