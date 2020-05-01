package com.designpatterns.creational.singelton;

/**
 * JVM executes static initializer when the class is loaded and hence this is guaranteed to be thread safe.
 * Use this method only when your singleton class is light and is used throughout the execution of your program.
 */
public class Singleton
{
    private Singleton()
    {
    }

    private static final Singleton INSTANCE = new Singleton();

    public static Singleton getInstance()
    {
        return INSTANCE;
    }
}

