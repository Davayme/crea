package com.ayme.david.prototype;

class Planta implements PlantaClonableInterface {
    private String nombre;
    private String descripcion;
    private double precio;

    public Planta(String nombre, String descripcion, double precio) {

        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
       
    }

    
    public String getNombre() {
        return this.nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getDescripcion() {
        return this.descripcion;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public double getPrecio() {
        return this.precio;
    }


    public void setPrecio(double precio) {
        this.precio = precio;
    }


    @Override
    public PlantaClonableInterface clonar() {

        return new Planta(this.nombre, this.descripcion, this.precio);
    }


    @Override
    public String toString() {
        return "Planta [nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio + "]";
    }
}