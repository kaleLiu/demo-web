package com.kale.web.dynamicproxy;

/**
 * Created by kaleLiu on 2017/4/1 0001.
 */
public class RealSubject implements Subject{
    @Override
    public void request() {
        System.out.println("From real subject.");
    }
}
