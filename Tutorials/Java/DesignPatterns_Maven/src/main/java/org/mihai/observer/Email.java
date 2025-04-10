package org.mihai.observer;

/**
 * The subscriber/observer
 */
public class Email implements Observer {
    private final String email;

    public Email(String email) {
        this.email = email;
    }

    @Override
    public void update() {
        System.out.println("Subscriber " + email + " has been notified");
    }
}
