package com.ayme.david.builder;

public class Main {
    public static void main(String[] args) {
       Director c = new Director();
       Car sports = c.builFamilyCar(new Car.Builder());
       System.out.println(sports.getName());
    }
}
