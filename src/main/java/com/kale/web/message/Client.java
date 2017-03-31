package com.kale.web.message;

/**
 * Created by kaleLiu on 2017/3/31 0031.
 */
public class Client {
    ThreadPoolManager tpm = ThreadPoolManager.newInstance();
    public void sendMsg( String msg ) {
        tpm.addLogMsg( msg + "记录一条日志" );
    }
    public static void main(String[] args) {
        for(int i=0;i<1000;i++){
            new Client().sendMsg( Integer.toString( i ) );
        }
        //new Client().sendMsg("发起一条对象" );
    }
}
