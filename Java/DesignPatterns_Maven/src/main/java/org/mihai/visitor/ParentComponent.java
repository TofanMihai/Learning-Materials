package org.mihai.visitor;

/**
 * Interface or abstract class
 */
public interface ParentComponent {
    public void accept(Visitor visitor);
}
