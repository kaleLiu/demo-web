package com.kale.web.dynamicproxy;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by kaleLiu on 2017/4/1 0001.
 */
public class Client {
    /**
     * 这个结果的信息非常重要，至少对我来说。因为我在动态代理犯晕的根源就在于将上面的subject.request()理解错了，至少是被表面所迷惑，没有发现这个subject和Proxy之间的联系，一度纠结于最后调用的这个request()是怎么和invoke()联系上的，而invoke又是怎么知道request存在的。其实上面的true和class $Proxy0就能解决很多的疑问，
     * 再加上下面将要说的$Proxy0的源码，完全可以解决动态代理的疑惑了。
     从以上代码和结果可以看出，我们并没有显示的调用invoke()方法，但是这个方法确实执行了。下面就整个的过程进行分析一下：
     *接着把得到的$Proxy0实例强制转换成Subject，并将引用赋给subject。当执行subject.request()方法时，就调用了$Proxy0类中的request()方法，进而调用父类Proxy中的h的invoke()方法.即InvocationHandler.invoke()。

     PS：1、需要说明的一点是，Proxy类中getProxyClass方法返回的是Proxy的Class类。之所以说明，是因为我一开始犯了个低级错误，以为返回的是“被代理类的Class类”- -！推荐看一下getProxyClass的源码，很长=。=
     2、从$Proxy0的源码可以看出，动态代理类不仅代理了显示定义的接口中的方法，而且还代理了java的根类Object中的继承而来的equals()、hashcode()、toString()这三个方法，并且仅此三个方法。
     Q：到现在为止，还有一个疑问，invoke方法中的第一个参数是Proxy的实例（准确说，最终用到的是$Proxy0的实例），但是有什么用呢？或者说，程序内是怎样显示出作用的？
     A：就本人目前的水平看来，这个proxy参数并没有什么作用，在整个动态代理机制中，并没有用到InvocationHandler中invoke方法的proxy参数。而传入的这个参数实际是代理类的一个实例。我想可能是为了让程序员在invoke方法中使用反射来获取关于代理类的一些信息吧。
     */
    public static void main(String[] args) throws Throwable{
        // TODO Auto-generated method stub
        Subject rs=new RealSubject();//这里指定被代理类
        InvocationHandler ds=new DynamicSubject(rs);
        Class<?> cls=rs.getClass();
        //以下是一次性生成代理
        Subject subject=(Subject) Proxy.newProxyInstance(
                cls.getClassLoader(), cls.getInterfaces(), ds);
        //这里可以通过运行结果证明subject是Proxy的一个实例，这个实例实现了Subject接口
        System.out.println(subject instanceof Proxy);
        //这里可以看出subject的Class类是$Proxy0,这个$Proxy0类继承了Proxy，实现了Subject接口
        System.out.println("subject的Class类是："+subject.getClass().toString());
        System.out.print("subject中的属性有：");
        Field[] field=subject.getClass().getDeclaredFields();
        for(Field f:field){
            System.out.print(f.getName()+", ");
        }
        System.out.print("\n"+"subject中的方法有：");
        Method[] method=subject.getClass().getDeclaredMethods();
        for(Method m:method){
            System.out.print(m.getName()+", ");
        }
        System.out.println("\n"+"subject的父类是："+subject.getClass().getSuperclass());
        System.out.print("\n"+"subject实现的接口是：");
        Class<?>[] interfaces=subject.getClass().getInterfaces();
        for(Class<?> i:interfaces){
            System.out.print(i.getName()+", ");
        }
        System.out.println("\n\n"+"运行结果为：");
        subject.request();
    }
}
