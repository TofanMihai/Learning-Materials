package org.mihai.visitor;

public class ChildA implements ParentComponent {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
