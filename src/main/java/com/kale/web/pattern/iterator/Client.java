package com.kale.web.pattern.iterator;

/**
 * Created by kaleLiu on 2017/3/26 0026.
 */
public class Client {
    public static void main(String[] args) {
        Collection collection = new MyCollection();
        Iterator it = collection.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
