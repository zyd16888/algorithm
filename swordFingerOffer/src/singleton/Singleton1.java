package singleton;

/**
 * 描述:
 * 单例模式
 * 单例模式要求在系统运行时，只存在唯一的一个实例对象
 *
 * 声明的时候就初始化对象会浪费不必要的资源
 *
 * @author dong
 * @date 2018-12-24 14:31
 */
public class Singleton1 {
    private static Singleton1 instance = new Singleton1();
    //构造器设置为private 禁止通过new进行实例化
    private Singleton1(){}
    public static  Singleton1 getInstance(){
        return instance;
    }
}
