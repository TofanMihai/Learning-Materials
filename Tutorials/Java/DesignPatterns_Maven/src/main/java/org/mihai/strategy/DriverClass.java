package org.mihai.strategy;

public class DriverClass {

    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();

        paymentService.setPaymentStrategy(new PaymentByCreditCard());
        paymentService.processOrder();

        paymentService.setPaymentStrategy(new PaymentByPaypal());
        paymentService.processOrder();


    }
}
