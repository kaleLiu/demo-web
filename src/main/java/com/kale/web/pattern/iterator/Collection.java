package com.kale.web.pattern.iterator;

/**
 * Created by kaleLiu on 2017/3/26 0026.
 */
public interface Collection {
    public Iterator iterator();

    /*ȡ�ü���Ԫ��*/
    public Object get(int i);

    /*ȡ�ü��ϴ�С*/
    public int size();
}
