package org.springnoPackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

/*        ApplicationContext context = new ClassPathXmlApplicationContext("noxmlConfig.xml");
        Student s1 = context.getBean("s1", Student.class);

        System.out.println(s1);*/

        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Student s1 = context.getBean("s4", Student.class);

        System.out.println(s1);
        s1.study();


    }
}
