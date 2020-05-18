package cn.laochou.adapter;

/**
 * 适配器
 */
public class Adapter extends Adaptee implements Target{
    @Override
    public void targetMethod() {
        super.adapteeMethod();
    }
}
