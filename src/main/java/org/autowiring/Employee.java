package org.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

// autowired can be used on object variables setters and constructors
// after autowiring we donot have to declare anything inside the xml file
public class Employee {
    @Autowired
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Employee(Address address) {
        super();
        this.address = address;
    }

    public Employee() {
        super();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }
}
