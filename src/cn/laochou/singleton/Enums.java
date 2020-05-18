package cn.laochou.singleton;

public class Enums {

    public enum InnerEnum {
        INSTANCE;
        private Enums enums;

        InnerEnum() {
            this.enums = new Enums();
        }

        public Enums getEnums() {
            return enums;
        }
    }

    public static Enums getInstance() {
        return InnerEnum.INSTANCE.getEnums();
    }

}
