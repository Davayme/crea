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
    
    public static class Builder{
        private String name;
        private int km; 

        public Builder(){

        }

        public Builder setName(String name){
            this.name = name;
            return this;
        }

        public Builder setKM(int num){
            this.km = num;
            return this;
        }

        public Car build(){
            Car car = new Car();
            car.setName(this.name);
            car.setKm(this.km);
            return car;
        }
    }
}