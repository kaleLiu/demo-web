package com.kale.web.pattern.bridge;

/**
 * Created by kaleLiu on 2017/3/26 0026.
 */
public abstract class Bridge {

    private Sourceable source;

    public void method(){
        source.method();
    }

    public Sourceable getSource() {
        return source;
    }

    public void setSource(Sourceable source) {
        this.source = source;
    }
}
