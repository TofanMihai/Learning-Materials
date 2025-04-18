package org.mihai.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * The Publisher / Observable Class
 */
public class Store {

    private List<Email> subscriberList = new ArrayList<>();

    public Store(List<Email> subscriberList) {
        this.subscriberList = subscriberList;
    }

    public Store() {

    }

    public void subscribe(Email email) {
        this.subscriberList.add(email);
    }

    public void unsubscribe(Email email) {
        this.subscriberList.remove(email);
    }

    public void notifySubscribers() {
        this.subscriberList.forEach(Email::update);
    }
}
