package cn.laochou.singleton;

public class DoubleCheck {

    private static volatile DoubleCheck doubleCheck = null;

    private static final Object lock = new Object();

    private DoubleCheck() {}

    /**
     * 说一下，为什么需要双层检测，假设两个线程都进到了synchronized锁，那么也会创建两个对象。矛盾
     * 为什么需要 volatile，因为一条java语句可能对应多条汇编（IX,ID,EX,MEM等），那么存在一个指令重排的风险
     * 这里就是为了避免返回了instance后，使用为null （一个new 包含了 申请内存，初始化，赋值）
     * @return
     */
    public static DoubleCheck getInstance() {
        if (doubleCheck == null) {
            synchronized (lock) {
                if (doubleCheck == null) {
                    doubleCheck = new DoubleCheck();
                }
            }
        }
        return doubleCheck;
    }

}
