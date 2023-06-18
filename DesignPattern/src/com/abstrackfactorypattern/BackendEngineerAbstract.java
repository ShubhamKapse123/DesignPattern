package com.abstrackfactorypattern;

public class BackendEngineerAbstract extends AbstractEngineerFactory {
  public  Engineer createEmploye(){
        return new BackendEngineer();
    }
}