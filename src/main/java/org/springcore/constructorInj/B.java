package org.springcore.constructorInj;

public class B {
    private String name;

    public B (String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
