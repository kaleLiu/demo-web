package com.kale.web.pattern.factory;

/**
 * Created by kaleLiu on 2017/3/26 0026.
 */
public class SendMailFactory implements Provider{
    public Sender produce() {
        return new MailSender();
    }
}
