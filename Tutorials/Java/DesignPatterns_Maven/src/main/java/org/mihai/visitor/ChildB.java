package org.mihai.visitor;

public class ChildB implements ParentComponent {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
