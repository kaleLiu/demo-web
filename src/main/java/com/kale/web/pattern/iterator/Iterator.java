package com.kale.web.pattern.iterator;

/**
 * Created by kaleLiu on 2017/3/26 0026.
 */
public interface Iterator {
    //ǰ��
    public Object previous();

    //����
    public Object next();
    public boolean hasNext();

    //ȡ�õ�һ��Ԫ��
    public Object first();
}
