package org.springCcore.collections;

import org.springcore.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("CollectionConfig.xml");

        Employees e1 = (Employees) context.getBean("emp1");

        System.out.println(e1);
        System.out.println(e1.getPhones().getClass().getName());


    }

}
