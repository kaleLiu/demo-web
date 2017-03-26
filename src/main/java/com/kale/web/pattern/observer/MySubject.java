package com.kale.web.pattern.observer;

/**
 * Created by kaleLiu on 2017/3/26 0026.
 */
public class MySubject extends AbstractSubject{
    public void operation() {
        System.out.println("update self!");
        notifyObservers();
    }
}
