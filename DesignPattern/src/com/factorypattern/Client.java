package com.factorypattern;

class Client{
    public static void main(String[] args) {
        Engineer engineer=EngineersFactory.getEngineer("FrontEnd");
        engineer.getEngineer();
    }
}