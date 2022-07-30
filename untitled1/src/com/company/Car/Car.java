package com.company.Car;

public class Car implements CarInt{
    String name;
    String brand;
    String color;

    public Car(String name, String brand, String color) {
        this.name = name;
        this.brand = brand;
        this.color = color;
    }

    @Override
    public void start() {
        System.out.println("star");
    }

    @Override
    public void stop() {
        System.out.println("stop");

    }

    public void print(){
        System.out.println("name; "+name);
        System.out.println("brand: "+brand);
        System.out.println("color: "+color);
    }
    public void motor(){
        System.out.println("motor" );
    }

}
