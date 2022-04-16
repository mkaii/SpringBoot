package org.springnoPackage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "org.springnoPackage" )
public class JavaConfig {

    @Bean
    public Samosas getSamosa()
    {
        Samosas sam1 = new Samosas();
        return sam1;
    }

    @Bean(name = {"s1","s2","s4"})
    public Student getStudent()
    {
        Student s1 = new Student(getSamosa());
        return s1;
    }
}
