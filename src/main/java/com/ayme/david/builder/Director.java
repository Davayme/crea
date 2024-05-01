package com.ayme.david.builder;

public class Director {
   public Car builSportCar(IBuilder builder){
    return builder.setName("Lujo")
    .setKM(50).build();
   } 

   public Car builFamilyCar(IBuilder builder){
    return builder.setName("Familia").setKM(0).build();
   }

   
}
