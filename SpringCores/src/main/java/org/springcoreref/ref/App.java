package org.springcoreref.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("RefConfig.xml");
        A temp = (A) context.getBean("aRef");
        System.out.println(temp);
    }
}
