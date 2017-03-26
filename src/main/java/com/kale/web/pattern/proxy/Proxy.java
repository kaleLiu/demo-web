package com.kale.web.pattern.proxy;

/**
 * Created by kaleLiu on 2017/3/26 0026.
 */
public class Proxy implements Sourceable{

    private Source source;

    public Proxy(){
        super();
        this.source = new Source();
    }

    public void method() {
        before();
        source.method();
        atfer();
    }
    private void atfer() {
        System.out.println("after proxy!");
    }
    private void before() {
        System.out.println("before proxy!");
    }
}
