package com.ayme.david.prototype;

class Plant implements ClonablePlantInterface {
    private String name;
    private String description;
    private double price;

    public Plant(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public ClonablePlantInterface clone() {
        return new Plant(this.name, this.description, this.price);
    }

    @Override
    public String toString() {
        return "Plant [name=" + name + ", description=" + description + ", price=" + price + "]";
    }
}