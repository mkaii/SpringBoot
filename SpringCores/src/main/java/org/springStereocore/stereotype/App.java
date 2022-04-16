package org.springStereocore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("StereoConfig.xml");
        Student s1 = context.getBean("student",Student.class);
        System.out.println(s1);
        System.out.println(s1.getAddresses().getClass().getName());
        System.out.println(s1.hashCode());

        Student s2 = context.getBean("student",Student.class);
        System.out.println(s2);
        System.out.println(s2.getAddresses().getClass().getName());
        System.out.println(s2.hashCode());

        Teacher t1 = context.getBean("teacher",Teacher.class);
        Teacher t2 = context.getBean("teacher",Teacher.class);
        System.out.println(t1);

        System.out.println(t2);
        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());
    }
}
