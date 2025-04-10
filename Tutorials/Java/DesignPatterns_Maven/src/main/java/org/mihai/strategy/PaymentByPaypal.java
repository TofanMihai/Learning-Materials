package org.mihai.strategy;

public class PaymentByPaypal implements PaymentStrategy {
    @Override
    public void pay(Long amount) {
        System.out.println("Paying by Paypal");
    }
}
