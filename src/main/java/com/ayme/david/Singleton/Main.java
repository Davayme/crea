package com.ayme.david.Singleton;

public class Main {
    public static void main(String[] args) {
        Instancia i1 = Instancia.getInstancia();
        Instancia i2 = Instancia.getInstancia();

        if (i1!=i2) {
            System.out.println("Funka singleton");
        }
    }
}
