package org.mihai.strategy;

public class PaymentByCreditCard implements PaymentStrategy {
    @Override
    public void pay(Long amount) {
        System.out.println("Paying by credit card");
    }
}
