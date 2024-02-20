package org.springcore.referenceType;

import org.springcore.collections.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ref-type-config.xml");
        A temp = (A) context.getBean("aref");
        System.out.println(temp.getaName());
        System.out.println(temp.getObj().getbName());
    }
}
