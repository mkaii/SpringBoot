package org.springnoPackage;


import org.springframework.stereotype.Component;


public class Student {

    private Samosas sam1;

    public Student(Samosas sam1) {
        this.sam1 = sam1;
    }

    public Samosas getSam1() {
        return sam1;
    }

    public void setSam1(Samosas sam1) {
        this.sam1 = sam1;
    }



    public void study()
    {
        this.sam1.display();
        System.out.println("studying is goping on ");
    }




}
