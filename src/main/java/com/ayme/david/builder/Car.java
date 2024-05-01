package com.ayme.david.builder;

/**
 * Car
 */
public class Car {

    private String name;
    private int km;

    public Car(){

    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getKm() {
        return this.km;
    }
    public void setKm(int km) {
        this.km = km;
    }
    
    public static class Builder implements IBuilder{
        private String name;
        private int km;

        @Override
        public IBuilder setName(String name) {
            this.name = name;
            return this;
        }
        @Override
        public IBuilder setKM(int km) {
            this.km = km;
            return this;
        }
        @Override
        public Car build() {
           Car c = new Car();
           c.setKm(this.km);
           c.setName(this.name);
           return c;
        } 

    }
}