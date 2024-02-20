package org.lifecyclemethods.interfaces;

import org.lifecyclemethods.usingxml.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("lifecycleInterface.xml");
        Product p1 =(Product) context.getBean("p1");
        System.out.println(p1);
    }
}
