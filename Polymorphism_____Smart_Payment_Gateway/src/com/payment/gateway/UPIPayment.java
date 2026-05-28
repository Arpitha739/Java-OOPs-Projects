package com.payment.gateway;

public class UPIPayment extends Payment {

    public UPIPayment(double amount) {
        super(amount);
    }

    @Override
    public void pay() {
        System.out.println("UPI Payment Successful ✅");
        System.out.println("Amount Paid: Rs." + amount);
    }
}