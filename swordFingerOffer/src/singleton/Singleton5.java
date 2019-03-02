package singleton;

/**
 * 描述:
 * 单例模式
 * 单例模式要求在系统运行时，只存在唯一的一个实例对象
 *
 * 通过静态内部类进行单例
 *
 * @author dong
 * @date 2018-12-24 15:53
 */
public class Singleton5 {

    private static class SingletonHolder{
        static Singleton5 instance = new Singleton5();
    }

    private Singleton5(){}

    public static Singleton5 getInstance() {
        return SingletonHolder.instance;
    }

}
