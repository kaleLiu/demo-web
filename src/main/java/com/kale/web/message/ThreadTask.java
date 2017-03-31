package com.kale.web.message;

/**
 * Created by kaleLiu on 2017/3/31 0031.
 */
public class ThreadTask extends Thread{
    public ThreadTask(String name){
        super(name);
    }

    @SuppressWarnings("static-access")
    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println(this.getName().toString() + ", will sleep 0 s");
        try {
            this.sleep(1*10);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(this.getName().toString() + ", I am wakeup now ");
    }
}
