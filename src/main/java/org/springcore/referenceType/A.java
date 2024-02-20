package org.springcore.referenceType;

public class A {
    private String aName;
    B obj;

    public B getObj() {
        return obj;
    }

    public String getaName() {
        return aName;
    }

    public void setObj(B obj) {
        this.obj = obj;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public A () {
        super();
    }
}
