package com.ayme.david.prototype;

public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        Plant prototipoLavanda = new Plant("Lavanda", "Planta aromática", 5.0);

        manager.addPrototype("lavanda", prototipoLavanda);

        //Clonacion de la planta lavanda
        Plant lavanda1 = (Plant) manager.createPlant("lavanda");
        Plant lavanda2 = (Plant) manager.createPlant("lavanda");
        
        //Cambio de precio de la planta lavanda
        
        lavanda1.setPrice(10.0);
        lavanda2.setPrice(15.0);

        //Impresion de las plantas lavanda
        System.out.println("\nPlanta 1: " + lavanda1 + "\nPlanta 2: " + lavanda2);
        
    }

}
