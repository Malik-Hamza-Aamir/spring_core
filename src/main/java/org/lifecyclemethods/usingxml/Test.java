package org.lifecyclemethods.usingxml;

import org.springcore.collections.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        // register shutdown hook because we need to call our own destroy method
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");
        context.registerShutdownHook();
        Product p1 =(Product) context.getBean("p1");
        System.out.println(p1);
    }
}
