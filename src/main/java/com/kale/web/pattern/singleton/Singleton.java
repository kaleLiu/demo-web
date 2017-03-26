package com.kale.web.pattern.singleton;

import java.util.Vector;

/**
 * Created by kaleLiu on 2017/3/26 0026.
 */
public class Singleton {

    private static Singleton instance = null;

    private Vector properties = null;

    public Vector getProperties() {
        return properties;
    }

    private Singleton() {
    }

    private static synchronized void syncInit() {
        if (instance == null) {
            instance = new Singleton();
        }
    }

    public static Singleton getInstance() {
        if (instance == null) {
            syncInit();
        }
        return instance;
    }

    public void updateProperties() {
        Singleton shadow = new Singleton();
        properties = shadow.getProperties();
    }
}
