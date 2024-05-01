package com.ayme.david.Singleton;

public class Instancia {
    private static Instancia instancia;
    private Instancia(){  

    }

    public static Instancia getInstancia(){
        if(instancia == null){
            return new Instancia();
        }

        return instancia;
    }

}

