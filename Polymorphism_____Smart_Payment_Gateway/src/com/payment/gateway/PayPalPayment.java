package com.payment.gateway;

public class PayPalPayment extends Payment {

    public PayPalPayment(double amount) {
        super(amount);
    }

    @Override
    public void pay() {
        System.out.println("PayPal Payment Successful 🌐");
        System.out.println("Amount Paid: Rs." + amount);
    }
}