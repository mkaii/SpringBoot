package org.springCIcore.ci;

public class Addition {

    private int a;
    private int b;

    public Addition(double a, double b) {
        this.a = (int)a;
        this.b = (int)b;
        System.out.println("constructor double , double");
    }

    public Addition(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("constructor int , int");
    }



    @Override
    public String toString() {
        return "Addition{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public void doSum()
    {
        System.out.println("Sum is  a + b = " + (a + b));
    }
}
