package org.lifecyclemethods.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Product implements InitializingBean, DisposableBean {
    public int price;

    public Product(int price) {
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

    // destroy
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("init");
    }

    // init
    @Override
    public void destroy() throws Exception {
        System.out.println("inside the destroy method");
    }


}
