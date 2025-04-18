package org.mihai.visitor;

public class DoSomethingElseVisitor implements Visitor {
    @Override
    public void visit(ChildA childA) {
        System.out.println("DoSomethingElse on ChildA");
    }

    @Override
    public void visit(ChildB childB) {
        System.out.println("DoSomethingElse on ChildB");

    }
}
