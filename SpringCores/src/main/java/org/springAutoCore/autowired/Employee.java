package org.springAutoCore.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

    @Autowired
    @Qualifier("address2")
    private Address address;

    public Employee() {
    }


    public Employee(Address address) {
        System.out.println("here at constructor");
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }


    public void setAddress(Address address) {
        System.out.println("here at setter");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }
}
