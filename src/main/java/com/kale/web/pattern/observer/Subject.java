package com.kale.web.pattern.observer;

/**
 * Created by kaleLiu on 2017/3/26 0026.
 */
public interface Subject {
    /*���ӹ۲���*/
    public void add(Observer observer);

    /*ɾ���۲���*/
    public void del(Observer observer);

    /*֪ͨ���еĹ۲���*/
    public void notifyObservers();

    /*����Ĳ���*/
    public void operation();
}
