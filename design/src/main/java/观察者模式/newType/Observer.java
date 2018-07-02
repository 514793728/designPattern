package 观察者模式.newType;

/**
 * author:Ben_sir.
 * Date : 2018/6/19/019 23:41
 * Description:依赖者
 */
public interface Observer {
    void update(float mTemperature, float mPressure, float mHumidity);
}
