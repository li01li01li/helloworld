package com.soft1721.spring.hello;

public class Phone {
    private String type;
    private double price;
    private double size;

    public Phone() {
    }

    public Phone(String type, double price, double size) {
        this.type = type;
        this.price = price;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }
}
