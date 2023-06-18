package com.abstrackfactorypattern;
class Client{
    public static void main(String[] args) {
        Engineer Backendengineer=EngineersFactory.getEngineer(new BackendEngineerAbstract());
        Backendengineer.getEngineer();

        Engineer Frontendengineer=EngineersFactory.getEngineer(new FrontEndEngineerAbtract());
        Frontendengineer.getEngineer();
    }
}