package com.ayme.david.factory;

import java.util.*;

public class FactoryAutos {
    
    public static Map<String, AutoInterface> autos = new HashMap<>();
    static {
        autos.put("moto", new Moto());
        autos.put("automovil", new Automovil());
    }

    public static AutoInterface getAuto(String nombre){

        AutoInterface auto = autos.get(nombre);
        if (auto!= null) {
            return auto;
        }

        return null;
    }
}
