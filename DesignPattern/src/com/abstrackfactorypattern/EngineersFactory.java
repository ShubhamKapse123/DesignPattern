package com.abstrackfactorypattern;

public interface EngineersFactory{
    public static Engineer getEngineer(AbstractEngineerFactory factory){
    return factory.createEmploye();
    
}
}