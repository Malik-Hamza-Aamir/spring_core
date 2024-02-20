package org.springcore.constructorInj;

import org.springcore.referenceType.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructorInjectionConfig.xml");
        Person p1 = (Person) context.getBean("person");
        System.out.println(p1);
    }
}
