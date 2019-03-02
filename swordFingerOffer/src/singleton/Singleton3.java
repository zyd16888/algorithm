package singleton;

/**
 * 描述:
 * 单例模式
 * 单例模式要求在系统运行时，只存在唯一的一个实例对象
 *
 * 通过关键字Synchronized强制线程同步
 * 会导致多线程竞争同一把锁，浪费资源
 * 可以增加临时变量，确保初始画完成后再赋值
 *
 * @author dong
 * @date 2018-12-24 15:12
 */
public class Singleton3 {
    private static Singleton3 instance = null;
    private Singleton3() {}
    public static synchronized Singleton3 getInstance() {
        if (instance == null) {
            Singleton3 i = new Singleton3();
            instance = i;
        }
        return instance;
    }
}
