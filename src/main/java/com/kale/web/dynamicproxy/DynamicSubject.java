package com.kale.web.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by kaleLiu on 2017/4/1 0001.
 */
public class DynamicSubject implements InvocationHandler{
    private Object obj;//���Ƕ�̬����ĺô�������װ�Ķ�����Object���ͣ������������͵Ķ���
    public DynamicSubject()
    {
    }
    public DynamicSubject(Object obj)
    {
        this.obj = obj;
    }
    //�����������������ʾ��ȥ����
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
    {
        System.out.println("before calling " + method);
        method.invoke(obj, args);
        System.out.println("after calling " + method);
        return null;
    }
}
