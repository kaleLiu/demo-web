package com.kale.web.pattern.factory;

/**
 * Created by kaleLiu on 2017/3/26 0026.
 */
public class Client {
    public static void main(String[] args) {
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.Send();
    }
}
