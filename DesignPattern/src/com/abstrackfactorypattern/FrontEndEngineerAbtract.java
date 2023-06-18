package com.abstrackfactorypattern;

public class FrontEndEngineerAbtract extends AbstractEngineerFactory {
  public  Engineer createEmploye(){
        return new FrontEndEnginner();
    }
}