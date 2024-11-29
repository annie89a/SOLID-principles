package com.fundSOLID.LiskovSubstitutionPrinciple.badExample;
// over here, liskov means the subclass should handle the responsibility of the superclass, without
//changing the behaviour of the base class
class Ostrich extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostriches cannot fly");
    }
}
