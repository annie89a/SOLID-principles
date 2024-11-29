package com.fundSOLID.InterfaceSegregationPrinciple.goodExample;

class Dog implements CanRun, CanSwim {
    public void swim() {
        System.out.println("Swimming");
    }

    public void run() {
        System.out.println("Running");
    }
}
