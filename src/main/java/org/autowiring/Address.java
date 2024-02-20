package org.autowiring;

public class Address {
    private String street;
    private String zipCode;

    public void setStreet(String street) {
        this.street = street;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public Address() {
        super();
    }

    @Override
    public String toString() {
        return street + " : " + zipCode;
    }
}
