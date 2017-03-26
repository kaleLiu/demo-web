package com.kale.web.pattern.proxy;

/**
 * Created by kaleLiu on 2017/3/26 0026.
 */
public class ProxyClient {
    public static void main(String[] args) {
        Sourceable source = new Proxy();
        source.method();
    }
}
