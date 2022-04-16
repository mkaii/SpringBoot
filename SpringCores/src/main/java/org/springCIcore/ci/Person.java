package org.springCIcore.ci;

public class Person {

    private String name;
    private int personId;
    private Certi certificate;

    public Person(String name, int personId ,Certi certificate) {
        this.name = name;
        this.personId = personId;
        this.certificate = certificate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personId=" + personId +
                ", certificate=" + certificate +
                '}';
    }
}

