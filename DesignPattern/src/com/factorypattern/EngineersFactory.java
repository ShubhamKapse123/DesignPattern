package com.factorypattern;

public interface EngineersFactory{
    public static Engineer getEngineer(String engineer){
     if(engineer.trim().equals("BackEnd")){
         return new BackendEngineer();
     }else if(engineer.trim().equals("FrontEnd")){
        return new FrontEndEnginner();
     }else{
         return null;
     }
    }
}