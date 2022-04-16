package org.springstandalonecore.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("StandAloneConfig.xml");

        Person p1 = context.getBean("p1", Person.class);
        System.out.println(p1);
        System.out.println(p1.getFriends().getClass().getName());
        System.out.println(p1.getFeeStructure().getClass().getName());
        System.out.println(p1.getProperties());
        System.out.println(p1.getProperties().getClass().getName());


    }
}
