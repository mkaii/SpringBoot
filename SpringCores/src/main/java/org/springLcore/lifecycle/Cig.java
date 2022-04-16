package org.springLcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Cig {

    private String brand;

    public Cig() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Cig{" +
                "brand='" + brand + '\'' +
                '}';
    }
    @PostConstruct
    public void start()
    {
        System.out.println("Starting my init without xml or interface");
    }

    @PreDestroy
    public void end()
    {
        System.out.println("ending my destroy method without xml or interface");
    }
}
