package com.kale.web.pattern.iterator;

/**
 * Created by kaleLiu on 2017/3/26 0026.
 */
public interface Collection {
    public Iterator iterator();

    /*取得集合元素*/
    public Object get(int i);

    /*取得集合大小*/
    public int size();
}
