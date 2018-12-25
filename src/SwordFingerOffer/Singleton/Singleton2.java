package SwordFingerOffer.Singleton;
/**
 * 描述:
 * 单例模式
 * 单例模式要求在系统运行时，只存在唯一的一个实例对象
 *
 * 即使instance已经被创建,每次调用getInstance方法还是会同步,这样就会浪费一些不必要的资源
 * 多线程不安全
 * 当两个线程同时进入if(instance == null)时，一个线程判断了当前为空，然后切换到另一个线程，这个线程也判断为空。然后切换回第一个线程，进行实例化，再切换到第二个线程，进行实例化。这样就存在了两个实例。
 *
 * @author dong
 * @date 2018-12-24 14:31
 */
public class Singleton2 {
    private static Singleton2 instance = null;
    private Singleton2() {}
    public static Singleton2 getInstance(){
        if (instance == null){
        instance = new Singleton2();
        }
        return instance;
        }
}
