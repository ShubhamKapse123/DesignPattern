package com.singlton;

public class TestEnumSingleton {
    public static void main(String[] args) {
        EnumSingleton instance= EnumSingleton.INSTANCE;
        System.out.println(instance.getName());
        instance.setName("Shubham");
        System.out.println(instance.getName());
    }
}
