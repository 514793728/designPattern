package 单例模式;

/**
 * author:Ben_sir.
 * Date : 2018/6/24/024 10:28
 * Description:
 */
public class LazySingleTonNoSafe {
    private LazySingleTonNoSafe() {
    }

    private static LazySingleTonNoSafe instance = null;

    public static final LazySingleTonNoSafe getInstance() {
        if(instance == null)
            instance = new LazySingleTonNoSafe();
        return instance;
    }
}
