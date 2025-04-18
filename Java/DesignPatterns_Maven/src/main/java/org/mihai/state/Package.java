package org.mihai.state;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Package {
    private PackageState state = new OrderedState();
    public void previousState() {
        state.prev(this);
    }
    public void nextState() {
        state.next(this);
    }
    public void printStatus() {
        state.printStatus();
    }
}