package com.ayme.david.prototype;

import java.util.HashMap;

public class GestorInventario {
    private HashMap<String, PlantaClonableInterface> prototipos = new HashMap<>();

    public void agregarPrototipo(String nombre, PlantaClonableInterface prototipo) {
        prototipos.put(nombre, prototipo);
    }

    public PlantaClonableInterface crearPlanta(String clave) {
        PlantaClonableInterface prototipo = prototipos.get(clave);
        if (prototipo != null) {
            return prototipo.clonar();
        }
        return null;
    }

    public HashMap<String, PlantaClonableInterface> getPrototipos() {
        return this.prototipos;
    }
}
