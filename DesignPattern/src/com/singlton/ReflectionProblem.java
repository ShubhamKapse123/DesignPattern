package com.singlton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionProblem {
    public static void main(String[] args) {
        ThreadSafeSinglton instance1 = ThreadSafeSinglton.getThreadSafeSinglton();
        ThreadSafeSinglton instance2 = null;

        Constructor[] constructors = ThreadSafeSinglton.class.getDeclaredConstructors();

        for (Constructor constructor : constructors) {
            constructor.setAccessible(true);
            try {
                instance2 = (ThreadSafeSinglton) constructor.newInstance();
                break;
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(instance2.hashCode());
        System.out.println(instance1.hashCode());
    }

}
