package com.ayme.david.factory;

public class Main {
    
    public static void main(String[] args) {
/*         Personaje a = Factory.getPersonaje("arquero");
        a.atacar();
        Personaje c = Factory.getPersonaje("caballero");
        c.atacar(); */

        AutoInterface moto = FactoryAutos.getAuto("moto");
        moto.conducir();
        AutoInterface auto = FactoryAutos.getAuto("automovil");
        auto.conducir();
    }
    
}
