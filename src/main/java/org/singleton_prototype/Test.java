package org.singleton_prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.singleton_prototype.Furniture;

public class Test {
    public static void main(String[] args) {
        ApplicationContext con = new ClassPathXmlApplicationContext("singleton_prototype.xml");
        Furniture f1 = con.getBean("f", Furniture.class);
        Furniture f2 = con.getBean("f", Furniture.class);
        System.out.println(f1);
        System.out.println(f1.hashCode());

        System.out.println(f2);
        System.out.println(f2.hashCode());
    }
}
