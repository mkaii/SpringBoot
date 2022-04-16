package org.springLcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        //ApplicationContext context = new ClassPathXmlApplicationContext("lifeCycleConfig.xml");

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifeCycleConfig.xml");
        context.registerShutdownHook();

        Samosa s1 = (Samosa) context.getBean("s1");
        System.out.println(s1);


        System.out.println("+++++++++++++++first bean code ends here++++++++");// note order of code execution wrt init / destroy could be weird

        Pepsi p1 = (Pepsi) context.getBean("p1");
        System.out.println(p1);

        Cig cig1 = (Cig) context.getBean("cig1");
        System.out.println(cig1);



    }
}
