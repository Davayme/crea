package com.ayme.david.factory;

import java.util.HashMap;
import java.util.Map;

public class Factory {
    private static Map<String, Personaje> personajes= new HashMap<>();

    static{
        personajes.put("caballero", new Caballero());
        personajes.put("arquero", new Arquero());
    }

    public static Personaje getPersonaje(String nombre){
        Personaje personaje = personajes.get(nombre);
        if (personaje != null) {
            return personaje;
        }
        return null;
    }
}
