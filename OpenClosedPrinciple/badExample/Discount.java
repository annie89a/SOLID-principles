package com.fundSOLID.OpenClosedPrinciple.badExample;

//in this example, this requires existing code to be modified in case of extension.
//we want to prevent this.
//solution: we use polymorphism WITHOUT modifying the existing code that is in production
class Discount {
    public double calculateDiscount(String customerType, double amount) {
        if (customerType.equals("Regular")) {
            return amount * 0.1;
        } else if (customerType.equals("Premium")) {
            return amount * 0.2;
        }
        return 0;
    }
}
