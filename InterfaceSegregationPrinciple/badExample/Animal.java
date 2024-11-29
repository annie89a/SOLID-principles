package com.fundSOLID.InterfaceSegregationPrinciple.badExample;
//Note: cannot force the classes that implements an interface to have definition for ALL functions of an interface
//note: we want to avoid bloated interface

//solution: break down Animal into smaller interfaces
interface Animal {
    void fly();
    void swim();
    void run();
}

class Dog implements Animal {
    @Override
    public void fly() {
        // Not applicable for dogs
    }

    @Override
    public void swim() {
        System.out.println("Swimming");
    }

    @Override
    public void run() {
        System.out.println("Running");
    }
}
