package org.lifecyclemethods.usingxml;

public class Product {
    public int price;

    public Product (int price) {
        this.price = price;
    }

    public Product() {
        super();
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product Price : " + price + "$";
    }

//    life cycle init method name can be anything of this method
    public void init() {
        System.out.println("inside init method");
    }

//    life cycle destroy method name can be anything of this method
    public void destroy() {
        System.out.println("inside the destroy method");
    }
}
