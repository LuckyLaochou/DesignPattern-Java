package cn.laochou.singleton;

/**
 * 单例模式之饿汉式模式
 */
public class Hungry {

    private static Hungry instance = new Hungry();

    // 私有化构造函数，使外界无法调用
    private Hungry() {}

    public static Hungry getInstance() {
        return instance;
    }

}
