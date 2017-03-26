package com.kale.web.pattern.facade;

/**
 * Created by kaleLiu on 2017/3/26 0026.
 */
public class UserClient {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
}
