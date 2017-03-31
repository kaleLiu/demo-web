package com.kale.web.message;

/**
 * Created by kaleLiu on 2017/3/31 0031.
 */
public class AccessDBThread implements Runnable{
    private String msg;

    public AccessDBThread() {
        super();
    }

    public AccessDBThread(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public void run() {

        // �����ݿ������Msg����ֵ
        System.out.println("Added the message: "+msg+" into the Database");
    }
}
