package com.company.Car;

public class Main {
    public static void main(String[] args) {
        Car  car = new Car("Fort", "X4 Fort","black");
        car.print();
        car.start();
        car.stop();
        car.motor();
        System.out.println("+++++++++++++++");
        BMW bmw  = new BMW("BMW","X7 BMW","White");
        bmw.print();
        bmw.start();
        bmw.stop();

        System.out.println("++++++++++++++++++++");
        Trac trac = new Trac("Man","Kamaz","red",100000);
        trac.print();
        trac.start();
        trac.stop();
        trac.location();

    }
}
