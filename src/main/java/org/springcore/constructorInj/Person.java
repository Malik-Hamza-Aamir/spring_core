package org.springcore.constructorInj;

public class Person {
    private String name;
    private B b;

    public Person(String name, B b) {
        this.name = name;
        this.b = b;
    }

    @Override
    public String toString() {
        return this.name + " : " + this.b.toString();
    }
}
