package com.ayme.david.builder;

/**
 * IBuilder
 */
public interface IBuilder {
    IBuilder setName(String name);
    IBuilder setKM(int km);
    Car build();
    
}