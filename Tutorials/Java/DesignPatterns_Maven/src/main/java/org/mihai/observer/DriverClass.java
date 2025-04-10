package org.mihai.observer;

public class DriverClass {

    public static void main(String[] args) {
        Store store = new Store();
        Email email1 = new Email("email1");
        Email email2 = new Email("email2");
        Email email3 = new Email("email3");
        Email email4 = new Email("email4");

        store.subscribe(email1);
        store.subscribe(email2);
        store.notifySubscribers();


        ////////
        StoreWithWeakReferences storeWithWeakReferences = new StoreWithWeakReferences();
        storeWithWeakReferences.subscribe(email3);
        storeWithWeakReferences.subscribe(email4);

        storeWithWeakReferences.notifySubscribers();

    }
}
