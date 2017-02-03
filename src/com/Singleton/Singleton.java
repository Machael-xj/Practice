package com.Singleton;

/**
 * Created by peng on 2017/1/27.
 */
public class Singleton {
    private Singleton(){
    }

    private static class Instanceholder{
        private static final Singleton Instance = new Singleton();
    }

    public Singleton getSingleton(){
        return Instanceholder.Instance;
    }
}
