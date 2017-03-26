package com.kale.web.pattern.adaptor;

/**
 * Created by kaleLiu on 2017/3/26 0026.
 */
public class ConcreteTarget implements Target{
    public void request() {
        System.out.println("普通类 具有 普通功能...");
    }
}
