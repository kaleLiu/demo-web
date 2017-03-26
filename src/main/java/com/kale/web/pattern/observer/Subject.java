package com.kale.web.pattern.observer;

/**
 * Created by kaleLiu on 2017/3/26 0026.
 */
public interface Subject {
    /*增加观察者*/
    public void add(Observer observer);

    /*删除观察者*/
    public void del(Observer observer);

    /*通知所有的观察者*/
    public void notifyObservers();

    /*自身的操作*/
    public void operation();
}
