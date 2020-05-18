package cn.laochou.adapter.object;

public class ConcreteAdaptee implements Adaptee {

    @Override
    public void adapteeMethod() {
        System.out.println("adaptee method is called");
    }
}
