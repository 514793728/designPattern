package 单例模式;

/**
 * author:Ben_sir.
 * Date : 2018/6/24/024 10:30
 * Description:
 */
public class LazySingleTonSafe {
    private static volatile LazySingleTonSafe instance = null;

    private LazySingleTonSafe() {
    }

    public static final LazySingleTonSafe getInstance() {
        if (instance == null) {
            synchronized (LazySingleTonSafe.class) {
                if(instance == null)
                    instance = new LazySingleTonSafe();
            }
        }
        return instance;
    }
}
