package com.company.Car;

public class BMW extends Car{
    public BMW(String name, String brand, String color) {
        super(name, brand, color);
    }

    @Override
    public void start() {
        System.out.println("start");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }

    @Override
    public void print() {
        System.out.println("Name: "+name);
        System.out.println("brand: "+brand);
        System.out.println("color: "+color);
    }
}
