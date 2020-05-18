package cn.laochou.singleton.test;

import cn.laochou.singleton.Hungry;

public class Test {

    public static void main(String[] args) {
        Hungry hungry = Hungry.getInstance();
        System.out.println(hungry);
    }

}
