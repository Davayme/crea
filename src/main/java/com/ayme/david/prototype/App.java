package com.ayme.david.prototype;

public class App {
    public static void main(String[] args) {
        GestorInventario gestor = new GestorInventario();

        Planta prototipoLavanda = new Planta("Lavanda", "Planta aromática", 5.0);

        gestor.agregarPrototipo("lavanda", prototipoLavanda);

        //Clonacion de la planta lavanda
        Planta lavanda1 = (Planta) gestor.crearPlanta("lavanda");
        Planta lavanda2 = (Planta) gestor.crearPlanta("lavanda");
        
        //Cambio de precio de la planta lavanda
        
        lavanda1.setPrecio(10.0);
        lavanda2.setPrecio(15.0);

        //Impresion de las plantas lavanda
        System.out.println(lavanda1);
        System.out.println(lavanda2);

    }

}
