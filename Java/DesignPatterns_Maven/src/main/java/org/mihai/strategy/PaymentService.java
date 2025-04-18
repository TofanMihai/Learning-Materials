package org.mihai.strategy;

public class PaymentService {
    private Long cost;

    private PaymentStrategy paymentStrategy;

    public void processOrder() {
        this.paymentStrategy.pay(this.cost);
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
}
