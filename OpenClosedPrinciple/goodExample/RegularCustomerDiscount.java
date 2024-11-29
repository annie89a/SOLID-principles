package com.fundSOLID.OpenClosedPrinciple.goodExample;

class RegularCustomerDiscount implements Discount {
    public double calculateDiscount(double amount) {
        return amount * 0.1;
    }
}