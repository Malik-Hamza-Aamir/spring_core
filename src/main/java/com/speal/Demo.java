package com.speal;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

    @Value("#{ 22+11 }")
    private int x;

    @Value("#{ 5+5 }")
    private int y;

    // invoke static method
    @Value("#{ T(java.lang.Math).sqrt(144) }")
    private double z;

    @Value("#{ new java.lang.String('Hamza Aamir') }")
    private String name;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", name=" + name +
                '}';
    }
}
