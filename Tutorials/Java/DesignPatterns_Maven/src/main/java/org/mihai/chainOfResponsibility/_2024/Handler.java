package chainOfResponsibility._2024;

import java.util.Objects;

/**
 * Our base handler class
 * Hold a reference to the next Handler in the Chain
 * Holds the method of dealing with the task, in which each Concrete Handler will implement its logic
 * Holds the default behaviour method of passing the request to the next handler in the chain, if it exists.
 */
public abstract class Handler {
    private Handler next;

    public Handler setNext(Handler handler) {
        this.next = handler;
        return next;
    }

    public abstract boolean handle(String username, String password, String role);
    
    protected boolean handleNext(String username, String password, String role) {
        if (Objects.isNull(next)) {
            return true;
        }
        return next.handle(username, password, role);
    }
}
