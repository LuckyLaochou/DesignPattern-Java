package cn.laochou.singleton;

/**
 * 单例模式之静态内部类
 */
public class StaticInnerClass {

    private StaticInnerClass() {}

    /**
     * 注意，类的加载只会被加载一次，它这个是通过类加载器来保证的
     */
    private static class InnerClass {
        private static StaticInnerClass instance = new StaticInnerClass();
    }

    public static StaticInnerClass getInstance() {
        return InnerClass.instance;
    }

}
