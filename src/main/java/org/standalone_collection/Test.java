package org.standalone_collection;

import org.standalone_collection.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("standalonecollection.xml");
        Person p1 = context.getBean("person", Person.class);
        System.out.println(p1);
    }
}
