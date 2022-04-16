package org.springLcore.lifecycle;

public class Samosa {
    private double price;

    public Samosa() {
        super();
    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("price is set");
        this.price = price;
    }

    public void hey()
    {
        System.out.println("inside init : hi there !!");
    }

    public void bye()
    {
        System.out.println("inside destroy : I ll die soon :-( ");
    }
}
