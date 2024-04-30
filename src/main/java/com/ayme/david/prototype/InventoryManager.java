package com.ayme.david.prototype;

import java.util.HashMap;

public class InventoryManager {
    private HashMap<String, ClonablePlantInterface> prototypes = new HashMap<>();

    public void addPrototype(String name, ClonablePlantInterface prototype) {
        prototypes.put(name, prototype);
    }

    public ClonablePlantInterface createPlant(String key) {
        ClonablePlantInterface prototype = prototypes.get(key);
        if (prototype != null) {
            return prototype.clone();
        }
        return null;
    }

    public HashMap<String, ClonablePlantInterface> getPrototypes() {
        return this.prototypes;
    }
}
