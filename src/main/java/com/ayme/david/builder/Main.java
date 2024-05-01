package com.ayme.david.builder;

public class Main {
    public static void main(String[] args) {
        Car c = new Car.Builder().
        setName("Carro")
        .setKM(10)
        .build();

        System.out.println(c.getKm());
    }
}
