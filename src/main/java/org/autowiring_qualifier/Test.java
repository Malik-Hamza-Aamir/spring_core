package org.autowiring_qualifier;

import org.autowiring_qualifier.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowiringqualifier.xml");
        Employee emp1 =(Employee) context.getBean("emp");
        System.out.println(emp1);
    }
}
