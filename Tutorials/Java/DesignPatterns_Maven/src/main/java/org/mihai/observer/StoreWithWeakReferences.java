package org.mihai.observer;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/**
 * The Publisher / Observable Class
 */
public class StoreWithWeakReferences {

    private List<WeakReference<Email>> subscriberList = new ArrayList<>();

    public StoreWithWeakReferences(List<Email> subscriberList) {
        for (Email email : subscriberList) {
            this.subscriberList.add(new WeakReference<>(email));
        }
    }

    public StoreWithWeakReferences() {

    }

    public void subscribe(Email email) {
        this.subscriberList.add(new WeakReference<>(email));
    }

    public void unsubscribe(Email email) {
        subscriberList.removeIf(reference -> reference.get() == email);
    }

    public void notifySubscribers() {
        for (WeakReference<Email> reference : subscriberList) {
            Email email = reference.get();
            if (email != null) {
                email.update();
            }
        }
    }
}
