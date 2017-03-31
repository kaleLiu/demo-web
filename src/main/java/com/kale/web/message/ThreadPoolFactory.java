package com.kale.web.message;

import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by kaleLiu on 2017/3/31 0031.
 */
public class ThreadPoolFactory {
    //�̳߳�
    private static ThreadPoolExecutor  pool;
    //�������
    private static ThreadPoolFactory factory;

    /**
     * ˽�й��캯��
     */
    private ThreadPoolFactory(){	}

    /**
     * ��ȡ��������
     * @param config
     * @return
     */
    public static ThreadPoolFactory getInstance(ThreadPoolConfig config){
        if(factory == null){
            factory = new ThreadPoolFactory();
        }

        if(pool == null){

            if(config.getHandler() == null){
                pool = new ThreadPoolExecutor(config.getCorePoolSize(),
                        config.getMaximumPoolSize(),config.getKeepAliveTime(),
                        config.getUnit(),config.getWorkQueue());
            }else{
                pool = new ThreadPoolExecutor(config.getCorePoolSize(),
                        config.getMaximumPoolSize(),config.getKeepAliveTime(),
                        config.getUnit(),config.getWorkQueue(),config.getHandler());
            }
        }
        System.out.println("pool  create= "+pool.toString());
        return factory;
    }

    /**
     * ����̳߳�����
     * @param run
     */
    public synchronized void addTask(Runnable run){
        pool.execute(run);
    }

    /**
     * ����̳߳�����
     * @param runs
     */
    public synchronized void addTask(List<Runnable> runs){
        if(runs != null){
            for(Runnable r:runs){
                this.addTask(r);
            }
        }
    }

    /**
     * �ر��̳߳�
     */
    public void closePool(){
        pool.shutdown();
    }
}
