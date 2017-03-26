package com.kale.web.pattern.factory;

/**
 * Created by kaleLiu on 2017/3/26 0026.
 */
public class MailSender implements Sender{
    public void Send() {
        System.out.println("this is mailsender!");
    }
}
