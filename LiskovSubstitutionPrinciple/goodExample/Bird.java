package com.fundSOLID.LiskovSubstitutionPrinciple.goodExample;

//solution : refactor the hierarchy
interface Bird {
    void eat();
}

interface FlyingBird extends Bird {
    void fly();
}

class Sparrow implements FlyingBird {
    public void eat() {
        System.out.println("Eating");
    }

    public void fly() {
        System.out.println("Flying");
    }
}

class Ostrich implements Bird {
    public void eat() {
        System.out.println("Eating");
    }
}
