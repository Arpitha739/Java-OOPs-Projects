package com.payment.gateway;

public class CreditCardPayment extends Payment {

    public CreditCardPayment(double amount) {
        super(amount);
    }

    @Override
    public void pay() {
        System.out.println("Credit Card Payment Successful 💳");
        System.out.println("Amount Paid: Rs." + amount);
    }
}