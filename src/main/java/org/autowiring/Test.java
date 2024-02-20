package org.autowiring;

import org.autowiring.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowiring.xml");
        Employee emp1 =(Employee) context.getBean("emp");
        System.out.println(emp1);
    }
}
