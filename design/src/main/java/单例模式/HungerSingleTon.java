package 单例模式;

/**
 * author:Ben_sir.
 * Date : 2018/6/24/024 10:32
 * Description:
 */
public class HungerSingleTon {
    private static final HungerSingleTon instance = new HungerSingleTon();

    private HungerSingleTon() {
    }

    public static final HungerSingleTon getInstance() {
        return instance;
    }
}
