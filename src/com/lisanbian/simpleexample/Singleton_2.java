package com.lisanbian.simpleexample;
/**
 * 实现单例模式，懒汉式,线程不安全
 */

public class Singleton_2 {

    private Singleton_2 singleton2 = null;

    private Singleton_2(){}

    public Singleton_2 getInstance(){
        if(singleton2==null){
            singleton2 = new Singleton_2();
        }
        return singleton2;

    }
}
/**
 *饿汉式，根据类加载机制，线程安全
 */

class EagerSingleton{
    private static EagerSingleton eagerSingleton = new EagerSingleton();
    private EagerSingleton(){}

    public EagerSingleton getEagerSingleton(){
        return eagerSingleton;
    }
}

/**
 * 懒汉式，线程安全，双重检锁机制
 */
class EagerSingletonPlus{
    private EagerSingletonPlus eagerSingletonPlus  = null;

    private EagerSingletonPlus(){}

    public EagerSingletonPlus getEagerSingletonPlus(){
        if(eagerSingletonPlus==null){
            synchronized (this){
                if(getEagerSingletonPlus()==null){
                    return new EagerSingletonPlus();
                }
            }
        }
        return eagerSingletonPlus;
    }
}



