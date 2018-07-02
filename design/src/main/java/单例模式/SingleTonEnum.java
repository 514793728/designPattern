package 单例模式;

public enum SingleTonEnum {
    SINGLE_TON_ENUM;

    private Bean instance;
    SingleTonEnum() {
        instance = new Bean();
    }

    public Bean getInstance() {
        return instance;
    }

    public static void main(String[] args){
        Bean bean1 = SingleTonEnum.SINGLE_TON_ENUM.getInstance();
        Bean bean2 = SingleTonEnum.SINGLE_TON_ENUM.getInstance();
        System.out.println(bean1 == bean2);
    }
}
