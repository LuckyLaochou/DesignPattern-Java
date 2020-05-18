package cn.laochou.singleton;


/**
 * 单例模式之懒汉式
 */
public class Lazy {

    private static Lazy lazy = null;

    private Lazy() {}

    public static Lazy getInstance() {
        if(lazy == null) {
            lazy = new Lazy();
        }
        return lazy;
    }

}
