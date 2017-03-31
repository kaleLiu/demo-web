package com.kale.web.message;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Created by kaleLiu on 2017/3/31 0031.
 */
public class TestThreadPoolMain {
    public static void main(String[] args) {

        //��������
        ThreadPoolConfig config = ThreadPoolConfig.getInstance();
        config.setCorePoolSize(2);
        config.setMaximumPoolSize(3);
        config.setKeepAliveTime(5);
        config.setUnit(TimeUnit.SECONDS);
        //��������С�������쳣
        config.setWorkQueue(new ArrayBlockingQueue<Runnable>(10));
        config.setHandler(new MyRejectedExecutionHandler());
        //�̳߳ع���
        ThreadPoolFactory factory = ThreadPoolFactory.getInstance(config);

        for(int i = 0;i<100;i++){
            factory.addTask(new ThreadTask(i+"-i"));
        }
        System.out.println("i add is over!-------------------");
    }
}
