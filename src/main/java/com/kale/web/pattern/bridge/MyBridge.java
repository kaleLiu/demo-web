package com.kale.web.pattern.bridge;

/**
 * Created by kaleLiu on 2017/3/26 0026.
 */
public class MyBridge extends Bridge{
    public void method(){
        getSource().method();
    }
}
