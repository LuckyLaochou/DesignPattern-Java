package cn.laochou.adapter.object;

public class Adapter implements Target {

    private final Adaptee adaptee;

    private Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void targetMethod() {
        adaptee.adapteeMethod();
    }
}
