package com.kale.web.pattern.observer;

/**
 * Created by kaleLiu on 2017/3/26 0026.
 */
public class Client {
    public static void main(String[] args) {
        Subject sub = new MySubject();
        sub.add(new Observer1());
        sub.add(new Observer2());
        sub.operation();
    }
}
