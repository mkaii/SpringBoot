package org.springCIcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("CiConfig.xml");
        Person p1 = (Person) context.getBean("person");
        System.out.println(p1);

        Addition a1 = (Addition) context.getBean("add");
        System.out.println(a1);
        a1.doSum();



    }
}
