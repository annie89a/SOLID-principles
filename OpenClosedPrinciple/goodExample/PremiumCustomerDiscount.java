package com.fundSOLID.OpenClosedPrinciple.goodExample;

class PremiumCustomerDiscount implements Discount {
    public double calculateDiscount(double amount) {
        return amount * 0.2;
    }
}
