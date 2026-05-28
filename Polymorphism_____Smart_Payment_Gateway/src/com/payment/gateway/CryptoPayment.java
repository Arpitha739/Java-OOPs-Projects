package com.payment.gateway;

public class CryptoPayment extends Payment {

    public CryptoPayment(double amount) {
        super(amount);
    }

    @Override
    public void pay() {
        System.out.println("Crypto Payment Successful 🪙");
        System.out.println("Amount Paid: Rs." + amount);
    }
}