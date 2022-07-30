package com.company.Car;

public class Trac extends Car{
    int Kg;

    public Trac(String name, String brand, String color, int kg) {
        super(name, brand, color);
        Kg = kg;
    }

    @Override
    public void start() {
        System.out.println("start");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }
public void location(){
    System.out.println("location: "+"Tashkent");
}
    @Override
    public void print() {
        System.out.println("Name: "+name);
        System.out.println("brand: "+brand);
        System.out.println("color: "+color);
        System.out.println("Kg: "+Kg);
    }
}
