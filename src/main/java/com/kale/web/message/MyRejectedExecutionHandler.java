package com.kale.web.message;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by kaleLiu on 2017/3/31 0031.
 */
public class MyRejectedExecutionHandler implements RejectedExecutionHandler {
    @Override
    public void rejectedExecution(Runnable task, ThreadPoolExecutor executor) {
        // TODO Auto-generated method stub
        System.out.println("Begin exception handler-----------");
        //ִ��ʧ������
        new Thread(task,"exception by pool").start();
        //��ӡ�̳߳صĶ���
        System.out.println("The pool RejectedExecutionHandler = "+executor.toString());
    }
}
