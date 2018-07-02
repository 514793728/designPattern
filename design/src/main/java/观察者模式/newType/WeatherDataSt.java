package 观察者模式.newType;

import java.util.HashSet;
import java.util.Set;

/**
 * author:Ben_sir.
 * Date : 2018/6/19/019 23:51
 * Description:
 */
public class WeatherDataSt implements Subject {

    private float mTemperature; //温度
    private float mPressure;    //气压
    private float mHumidity;    //湿度

    private Set<Observer> observers;

    public WeatherDataSt() {
        this.observers = new HashSet<>();
    }

    @Override
    public void registObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if(observers.contains(observer))
             observers.remove(observer);
    }

    @Override
    public void nodifyObservers() {
        observers.stream().forEach(v -> v.update(mTemperature,mPressure,mHumidity));
    }

    /**
     * return : 有新数据时通知变更
     * date : 2018/6/19/019 23:28
     * description :
     */
    public void setData(float mTemperature, float mPressure, float mHumidity) {
        this.mTemperature = mTemperature;
        this.mPressure = mPressure;
        this.mHumidity = mHumidity;
        dataChange();
    }

    public void dataChange() {
        nodifyObservers();
    }
}
