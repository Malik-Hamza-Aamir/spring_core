package org.autowiring_qualifier;

import org.autowiring_qualifier.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

// autowired can be used on object variables setters and constructors
// after autowiring we donot have to declare anything inside the xml file
// qualifier is added because we want to select another bean
public class Employee {
    @Autowired
    @Qualifier("address2")
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
