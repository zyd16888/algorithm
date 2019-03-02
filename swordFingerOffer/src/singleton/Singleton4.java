package singleton;

/**
 * 描述:
 * 单例模式
 * 单例模式要求在系统运行时，只存在唯一的一个实例对象
 *
 *  Double Check Lock(DCL模式)
 *  第一次加载慢，Java处理器允许乱序执行，偶尔会失败
 *
 * @author dong
 * @date 2018-12-24 15:45
 */
public class Singleton4 {
    private static Singleton4 instance;
    private Singleton4(){}

    public static Singleton4 getInstance(){
        if (instance == null){
            synchronized (Singleton4.class){
                if (instance == null){
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}
