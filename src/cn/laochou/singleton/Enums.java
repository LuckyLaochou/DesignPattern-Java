package cn.laochou.singleton;

public class Enums {

    public enum InnerEnum {
        INSTACE;
        private Enums enums;

        InnerEnum() {
            this.enums = new Enums();
        }

        public Enums getEnums() {
            return enums;
        }
    }

    public static Enums getInstance() {
        return InnerEnum.INSTACE.getEnums();
    }

}
