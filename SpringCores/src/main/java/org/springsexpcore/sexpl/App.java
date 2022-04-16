package org.springsexpcore.sexpl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext cons = new ClassPathXmlApplicationContext("sexplconfig.xml");
        Demo d1 = cons.getBean("demo",Demo.class);
        System.out.println(d1);
    }
}
