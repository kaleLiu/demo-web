package com.kale.web.message;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.TimeUnit;

/**
 * Created by kaleLiu on 2017/3/31 0031.
 */
public class ThreadPoolConfig {

    //������������߳��������������̡߳�
    private int corePoolSize;
    //�������������߳�����
    private int maximumPoolSize;
    //���߳������ں���ʱ����Ϊ��ֹǰ����Ŀ����̵߳ȴ���������ʱ�䡣
    private long keepAliveTime;
    //������ʱ�䵥λ��
    private TimeUnit unit;
    //ִ��ǰ���ڱ�������Ķ��С��˶��н��ɱ��� execute �����ύ�� Runnable ����
    private BlockingQueue<Runnable> workQueue;
    //���ڳ����̷߳�Χ�Ͷ���������ʹִ�б�����ʱ��ʹ�õĴ������
    private RejectedExecutionHandler handler;
    //�����ļ��������
    private static ThreadPoolConfig config;
    /**
     * ����ģʽ
     */
    private ThreadPoolConfig(){

    }

    /**
     * ��ȡ�����ļ�����
     * @return
     */
    public static ThreadPoolConfig getInstance(){
        if(config == null){
            config = new ThreadPoolConfig();
        }
        return config;
    }
    public int getCorePoolSize() {
        return corePoolSize;
    }
    public void setCorePoolSize(int corePoolSize) {
        this.corePoolSize = corePoolSize;
    }
    public int getMaximumPoolSize() {
        return maximumPoolSize;
    }
    public void setMaximumPoolSize(int maximumPoolSize) {
        this.maximumPoolSize = maximumPoolSize;
    }
    public long getKeepAliveTime() {
        return keepAliveTime;
    }
    public void setKeepAliveTime(long keepAliveTime) {
        this.keepAliveTime = keepAliveTime;
    }
    public TimeUnit getUnit() {
        return unit;
    }
    public void setUnit(TimeUnit unit) {
        this.unit = unit;
    }
    public BlockingQueue<Runnable> getWorkQueue() {
        return workQueue;
    }
    public void setWorkQueue(BlockingQueue<Runnable> workQueue) {
        this.workQueue = workQueue;
    }
    public RejectedExecutionHandler getHandler() {
        return handler;
    }
    public void setHandler(RejectedExecutionHandler handler) {
        this.handler = handler;
    }
}
