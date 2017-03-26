package com.kale.web.pattern.iterator;

/**
 * Created by kaleLiu on 2017/3/26 0026.
 */
public interface Iterator {
    //前移
    public Object previous();

    //后移
    public Object next();
    public boolean hasNext();

    //取得第一个元素
    public Object first();
}
